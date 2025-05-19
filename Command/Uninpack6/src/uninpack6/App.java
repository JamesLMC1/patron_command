
package uninpack6;

import uninpack6.Cuenta;
import uninpack6.DepositarImpl;
import uninpack6.Invoker;
import uninpack6.RetirarImpl;

public class App {

    
    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta (34, 450);
        
        DepositarImpl opDepositar = new DepositarImpl(cuenta, 100);
        RetirarImpl opRetirar = new RetirarImpl(cuenta, 175);
        
        Invoker ivk = new Invoker();
        ivk.recibirOperacion(opDepositar);
        ivk.recibirOperacion(opRetirar);
        
        ivk.realizarOperaciones(); 
    }
    
}
