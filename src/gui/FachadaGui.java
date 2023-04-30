package gui;

import aplicacion.Cliente;
import aplicacion.Producto;
import java.awt.Color;
import java.util.HashMap;

public class FachadaGui {

    aplicacion.FachadaAplicacion fa;
    VPrincipal vp;
    VCliente vc;
    

    public FachadaGui(aplicacion.FachadaAplicacion fa) {
        this.fa = fa;
        this.vp = new VPrincipal(fa);
    }

    public void iniciaVista() {

        VAutentificacion va;

        va  = new VAutentificacion(vp, true, fa);
        vp.setVisible(true);
        va.setVisible(true);

    }

    public void verVentanaPerfil(Cliente cliente) {

        vc = new VCliente(vp, true, fa, cliente);
        vc.setVisible(true);

    }
    
    public void verVentanaCesta(HashMap<Producto, Integer> productos, Cliente cliente){
        VCesta vce = new VCesta(fa, productos, cliente);
        vce.setVisible(true);
    }

    public void verVentanaObtenerPrime(Cliente cliente) {
        VObtenerPrime vPrime = new VObtenerPrime(vp, true, fa, vc, cliente);
        vPrime.setVisible(true);
    }

    public void verVentanaDirecciones(Cliente cliente) {

        VDirecciones vd = new VDirecciones(vp, true, fa, vc, cliente);
        vd.setVisible(true);

    }

    public void verVentanaMetodosPago(Cliente cliente) {

        VMetodosPago vmp = new VMetodosPago(vp, true, fa, vc, cliente);
        vmp.setVisible(true);

    }

    public void muestraExcepcion(String txtExcepcion, Color color) {

        VAviso va  = new VAviso(vp, true, txtExcepcion, color);
        va.setVisible(true);

    }
    
    

}
