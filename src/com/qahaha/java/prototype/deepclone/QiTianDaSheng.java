package prototype.deepclone;

import java.io.*;
import java.util.Date;

public class QiTianDaSheng extends Monkey implements Cloneable, Serializable {
    public Jingubang jingubang;

    public QiTianDaSheng() {
        this.jingubang = new Jingubang();
        this.birthday = new Date();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return this.deepclone();
    }
    public Object deepclone(){

        try {
            ByteArrayOutputStream stream = new ByteArrayOutputStream();
            ObjectOutputStream oom = new ObjectOutputStream(stream);
            oom.writeObject(this);

            ByteArrayInputStream bis = new ByteArrayInputStream(stream.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            QiTianDaSheng copy  = (QiTianDaSheng) ois.readObject();
            copy.birthday = new Date();
            return copy;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }

    public QiTianDaSheng shallowClone(QiTianDaSheng target){
        QiTianDaSheng qiTianDaSheng1 = new QiTianDaSheng();
        qiTianDaSheng1.height = target.height;
        qiTianDaSheng1.weight = target.weight;
        qiTianDaSheng1.jingubang = target.jingubang;
        qiTianDaSheng1.birthday = new Date();
        return qiTianDaSheng1;
    }
}
