/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zeroonething.wikindo.webservice;

import com.zeroonething.wikindo.Model.Article;
import javax.jws.WebService;
import javax.jws.WebParam;

/**
 *
 * @author Didik Kurniawan
 */
@WebService
public interface wikindoAccountService {
    public Article getArticle(@WebParam(name="judul_article") final String judul);
    
    public void addArticle(@WebParam(name="detail_article")final Article detail);
}
