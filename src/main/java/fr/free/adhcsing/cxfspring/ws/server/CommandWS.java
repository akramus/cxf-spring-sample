package fr.free.adhcsing.cxfspring.ws.server;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface CommandWS {
    @WebMethod(operationName = "concat")
    String concat(
            String ch1, String ch2);
}
