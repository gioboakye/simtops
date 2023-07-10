/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gio.controller;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
/**
 *
 * @author danieldwomor
 */
@Path("simtops")
@Consumes(value = {MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
@Produces(value = {MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
public class SimTopController {

    @Context
    private UriInfo uriInfo;
    
    private static final Logger LOG = LogManager.getLogger(SimTopController.class);

    @GET
    @Path(value = "/test")
    @Produces(value = {MediaType.APPLICATION_JSON})
    public String getTest() {
        LOG.info("This is my first log");
        String payload = "{\n"
                + "    \"status\":200,\n"
                + "    \"message\":\"SimTopService is up and running! Yayy!!!\"\n"
                + "}";
        return payload;
    }

}
