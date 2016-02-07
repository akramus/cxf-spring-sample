package fr.free.adhcsing.cxfspring.rest.server.impl;

import fr.free.adhcsing.cxfspring.rest.server.CommandRest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

/**
 * The class <code>CommandRestImpl</code> RESTFUL service of incoming commands.
 * <p>
 * <p>
 * Unless otherwise noted, passing a <code>null</code> argument to a constructor
 * or method in this class will cause a NullPointerException to be thrown.
 *
 * @author Akram DHAOUI
 * @version 1.0 9 juil. 2014
 */

public class CommandRestImpl implements CommandRest {

    private final static Logger logger = LoggerFactory
            .getLogger(CommandRestImpl.class);

    @Path("/concat/{ch1}/{ch2}")
    @POST
    @Override
    public String concat(@PathParam("ch1") String ch1, @PathParam("ch2") String ch2) {
        return ch1 + ch2;
    }

}
