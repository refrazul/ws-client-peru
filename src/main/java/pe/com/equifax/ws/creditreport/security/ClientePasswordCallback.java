package pe.com.equifax.ws.creditreport.security;

import java.io.IOException;

import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.UnsupportedCallbackException;

import org.apache.ws.security.WSPasswordCallback;

public class ClientePasswordCallback implements CallbackHandler {

   @Override
   public void handle(Callback[] callbacks) throws IOException, UnsupportedCallbackException {
      WSPasswordCallback pc = (WSPasswordCallback) callbacks[0];
      // set the password for our message.
      pc.setPassword("");

      // En caso de que el cliente sea multiusuario, 
      // con pc.getIdentifier() podriamos obtener el nombre de usuario
      // para poner la password que corresponda a ese usuario.
   }
}