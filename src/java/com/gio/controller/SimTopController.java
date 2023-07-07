/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gio.controller;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *
 * @author arsenio
 */
@Path("simtops")
@Consumes(value = {MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
@Produces(value = {MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
public class SimTopController {

    @Context
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
