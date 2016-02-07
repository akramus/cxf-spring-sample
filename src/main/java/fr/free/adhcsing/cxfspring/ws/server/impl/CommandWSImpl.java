package fr.free.adhcsing.cxfspring.ws.server.impl;

import fr.free.adhcsing.cxfspring.ws.server.CommandWS;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.jws.WebService;
import javax.xml.ws.BindingType;
import javax.xml.ws.soap.SOAPBinding;

/**
 * The class <code>CommandWSImpl</code> CommandBean WS
 * <p>
 * <p>
 * Unless otherwise noted, passing a <code>null</code> argument to a constructor
 * or method in this class will cause a NullPointerException to be thrown.
 *
 * @author Akram DHAOUI
 * @version 1.0 4 août 2014
 */
@WebService(endpointInterface = "fr.free.adhcsing.cxfspring.ws.server.CommandWS")
@BindingType(SOAPBinding.SOAP12HTTP_BINDING)
public class CommandWSImpl implements CommandWS {

    private static final Logger logger = LoggerFactory
            .getLogger(CommandWSImpl.class);


    @Override
    public String concat(String ch1, String ch2) {
        return ch1 + ch2;
    }
}
