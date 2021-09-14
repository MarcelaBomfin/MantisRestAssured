package com.javarestassuredtemplate.tests.Users;

import com.javarestassuredtemplate.DefaultParameters.GlobalStaticParameters;
import com.javarestassuredtemplate.bases.TestBase;

public class PostCriarUsuarioDeTestes extends TestBase {

    GlobalStaticParameters globalStaticParameters;

    public void criarUsuario(){
        globalStaticParameters = new GlobalStaticParameters();
    }
}
