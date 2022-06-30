package prototype.deepclone;

public class DeepCloneTest {
    public static void main(String[] args) {
        QiTianDaSheng qiTianDaSheng = new QiTianDaSheng();
        try {
            QiTianDaSheng qiTianDaSheng1 = (QiTianDaSheng) qiTianDaSheng.clone();
            System.out.println(qiTianDaSheng1.jingubang == qiTianDaSheng.jingubang);
        } catch (Exception e) {
            e.printStackTrace();
        }
        QiTianDaSheng qiTianDaSheng2 = qiTianDaSheng.shallowClone(qiTianDaSheng);
        System.out.println(qiTianDaSheng2.jingubang == qiTianDaSheng.jingubang);
    }
}
