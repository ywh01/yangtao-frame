package yangtao.love.common.mongo.exception;

/**
 * mongo 异常类
 *
 * @author loser
 * @date 2023/6/13
 */
public class EasyMongoException extends RuntimeException {

    public EasyMongoException(String message) {
        super(message);
    }

    public EasyMongoException(Throwable throwable) {
        super(throwable);
    }

    public EasyMongoException(String message, Throwable throwable) {
        super(message, throwable);
    }
}
