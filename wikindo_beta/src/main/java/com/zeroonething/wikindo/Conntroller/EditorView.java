/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zeroonething.wikindo.Conntroller;

import javax.faces.bean.ManagedBean;

/**
 *
 * @author Bebek
 */
@ManagedBean
public class EditorView {
         
    private String text;
 
    public String getText() {
        return text;
    }
 
    public void setText(String text) {
        this.text = text;
    }
}
