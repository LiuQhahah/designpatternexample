package decorator1;

public class SigninService implements ISigninService{
    @Override
    public ResultMsg regist(String username, String password) {
        return new ResultMsg(200,"regist successful",new Member());
    }

    @Override
    public ResultMsg login(String username, String password) {
        return null;
    }
}
