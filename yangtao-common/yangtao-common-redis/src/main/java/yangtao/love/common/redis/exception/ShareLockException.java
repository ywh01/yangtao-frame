package yangtao.love.common.redis.exception;

public class ShareLockException extends RuntimeException{

    public ShareLockException(String message){
        super(message);
    }

}
