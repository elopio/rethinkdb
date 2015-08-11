// Autogenerated by metajava.py.
// Do not edit this file directly.
// The template for this file is located at:
// ../../../../../../../../templates/AstSubclass.java
package com.rethinkdb.ast.gen;

import com.rethinkdb.model.Arguments;
import com.rethinkdb.model.OptArgs;
import com.rethinkdb.ast.ReqlAst;
import com.rethinkdb.proto.TermType;


public class IndexList extends ReqlQuery {


    public IndexList(java.lang.Object arg) {
        this(new Arguments(arg), null);
    }
    public IndexList(Arguments args, OptArgs optargs) {
        this(null, args, optargs);
    }
    public IndexList(ReqlAst prev, Arguments args, OptArgs optargs) {
        this(prev, TermType.INDEX_LIST, args, optargs);
    }
    protected IndexList(ReqlAst previous, TermType termType, Arguments args, OptArgs optargs){
        super(previous, termType, args, optargs);
    }


    /* Static factories */
    public static IndexList fromArgs(java.lang.Object... args){
        return new IndexList(new Arguments(args), null);
    }


}