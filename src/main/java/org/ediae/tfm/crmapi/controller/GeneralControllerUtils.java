package org.ediae.tfm.crmapi.controller;

import org.ediae.tfm.crmapi.constant.GeneralConstant;
import org.springframework.ui.ModelMap;

public class GeneralControllerUtils {
    static ModelMap crearRespuestaModelMapOk(Object data) {
        ModelMap response = new ModelMap();
        response.put(GeneralConstant.TYPE, GeneralConstant.OK);
        response.put(GeneralConstant.EXCEPTION, null);
        response.put(GeneralConstant.DATA, data);
        return response;
    }

    static ModelMap crearRespuestaModelMapError(Exception ex) {
        ModelMap response = new ModelMap();
        response.put(GeneralConstant.TYPE, GeneralConstant.EXCEPTION);
        response.put(GeneralConstant.EXCEPTION, ex);
        response.put(GeneralConstant.DATA, null);
        return response;
    }
}
