package com.bedu.Main.model;

import org.springframework.stereotype.Component;

import java.sql.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

@Component
public class Info {

    private HashMap<Integer, String> _info;

    public Info() {
        this._info = new HashMap<>();
        this._info.put( 1, "a" );
        this._info.put( 2, "b" );
        this._info.put( 3, "c" );
        this._info.put( 4, "d" );
        this._info.put( 5, "e" );
    }

    public String getOne(int index) {

        if( this._info.containsKey( index ) ) {
            return this._info.get(index);
        }

        return "";
    } // ./getOne();

    public List<String> getAll( ) {

        List<String> lista = new ArrayList<String>(this._info.values());
        return lista;
    }

    public List<String> set( String obj ) {
        this._info.put( 6, obj );

        return getAll();
    }

    public List<String> borra( int id) {

        if( this._info.containsKey(id) ) {
            this._info.remove(id);
        }

        return getAll();
    }
}
