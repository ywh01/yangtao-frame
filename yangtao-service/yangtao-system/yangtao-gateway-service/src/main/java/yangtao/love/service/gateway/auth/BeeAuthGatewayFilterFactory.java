package yangtao.love.service.gateway.auth;


import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.factory.AbstractGatewayFilterFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.server.reactive.ServerHttpResponse;
import org.springframework.stereotype.Component;

/**
 * @author ywh
 */
@Slf4j
@Component
public class BeeAuthGatewayFilterFactory extends AbstractGatewayFilterFactory<Object> {


    @Override
    public GatewayFilter apply(Object config) {
        return (exchange, chain) -> {
            HttpHeaders headers = exchange.getRequest().getHeaders();
            String url = exchange.getRequest().getURI().getPath();
            ServerHttpResponse response = exchange.getResponse();
            return chain.filter(exchange);
        };
    }
}
