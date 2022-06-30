package decorator1;

public interface ISigninService {
    ResultMsg regist(String username, String password);
    ResultMsg login(String username, String password);
}
