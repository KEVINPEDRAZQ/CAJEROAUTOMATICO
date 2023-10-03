import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int saldo = 100000;
        int opcion = 0;
        float dineroingresado, retirodinero;
        while (opcion != 3) {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("bienvenido al cajero automatico coco loco\n"
                    + "1.desea ingrsar dinero a su cuenta\n"
                    + "2.desea sacar dinero de su cuenta\n"
                    + "3.salir"));

            switch (opcion) {
                case 1:
                    dineroingresado = Float.parseFloat(JOptionPane.showInputDialog("dijite la cantidad de dinero que va a ingresar a su cuenta"));
                    saldo = (int) (saldo + dineroingresado);
                    JOptionPane.showMessageDialog(null, "el dinero que tienes en tu cuenta es de" + saldo);
                    break;
                case 2:
                    retirodinero = Float.parseFloat(JOptionPane.showInputDialog("dijite la cantidad de dinero que desea retirar de la cuenta"));
                    if (retirodinero > saldo) {
                        JOptionPane.showMessageDialog(null, "el dinero que desea ingresar no esta disponible trabaje mas");
                    } else {
                        saldo = (int) (saldo - retirodinero);
                        JOptionPane.showMessageDialog(null, "el saldo de la cuenta esta en" + saldo);

                    }
                    break;
                case 3:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "la opcion que ingreso no exite por favor revise su vista");
                    break;


            }
        }
    }
}
