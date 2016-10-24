/**
 * Created by konstantyn on 19.04.2016.
 */
package com.example.loginregister;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;


public class RegisterRequest extends StringRequest
{
    private static final String REGISTER_REQUEST_URL = "Register.php";

    /**
     * @param Map<> An object that holds keys to values. A map cannot contain duplicate keys; each key can map to at most one value.
     */
    private Map<String,String> params;

    //Java  Constructor
    public RegisterRequest(String name, int age, String username, String password,  Response.Listener<String> listener)
    {
        /**
         * @param super invoke constructor from StringRequest.class ( like subclass take from Superclass )
         *              Invocation of a superclass constructor must be the first line in the subclass constructor.
         */
        super(Method.POST, REGISTER_REQUEST_URL, listener, null);


        // create a new HashMap<>  ( in one line -> Map<String, String> map = new HashMap<String, String>();)
        params = new HashMap<>();
        //adding keys with values
        params.put("name",name);
        // convert integer to the String ("age",age + "")
        params.put("age",age + "");
        params.put("username",username);
        params.put("password",password);

    }



    /**
     * access to the params ( for the Volley)
     *  When request is executed Volley use method getParams
     *  and getPrams() return the prams (Which we already fill on top )
     */
    @Override
    public Map<String, String> getParams()
    {
        return params;
    }

}