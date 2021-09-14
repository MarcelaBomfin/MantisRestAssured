package com.javarestassuredtemplate.requests.Users;

import com.javarestassuredtemplate.bases.RequestRestBase;
import io.restassured.http.Method;

public class PostCriarUsuarioDeTesteRequests extends RequestRestBase {

    public PostCriarUsuarioDeTesteRequests() {
        requestService = "/api/rest/users/";
        method = Method.POST;
        headers.put("Authorization", "RWHoZf-MvTVyIv39dBXo9lncHP9mPFu2");
    }

    public void setJasonBodyUsingJavaObject(BuscarDadosDeUsuario buscarDadosDeUsuario) { jsonBody = buscarDadosDeUsuario; }
}
