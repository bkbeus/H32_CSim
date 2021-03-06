/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ast;

import lexer.Token;
import parser.Scope;

/**
 *
 * @author Alan
 */
public abstract class Declaration extends ASTNode {

    public Declaration() {
        
    }
    
    public Declaration(Token symbol){
        super(symbol);
    }
    
    public abstract int getAllocSize();

    public Scope getScope() {
        return scope;
    }

    public void setScope(Scope scope) {
        this.scope = scope;
    }
    
    public abstract Type getType();
    //
    protected Scope scope;
    
}
