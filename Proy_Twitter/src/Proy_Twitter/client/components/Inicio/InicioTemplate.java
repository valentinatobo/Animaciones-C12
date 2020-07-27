
package Proy_Twitter.client.components.Inicio;

import Proy_Twitter.client.components.Tarjeta.TarjetaComponent;
import Proy_Twitter.client.components.Tarjeta.TarjetaTemplate;
import Proy_Twitter.servicies.ObjGraficosService;
import Proy_Twitter.servicies.RecursosService;
import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;


/**
 *
 * @author lenovo
 */
public class InicioTemplate extends JPanel{

    private InicioComponent iniciocomponent;
    private RecursosService sRecursos;
    private ObjGraficosService sObjGraficos;
    
    //Declarar objetos decoradores
    private ImageIcon iFotop1, iFotop2, iFotop3, iFotop4, iFotop5, iFotop, iFoto6 ;
    private JButton bArriba, bAbajo;
    private ImageIcon iarriba, iabajo, iDimaux ;
    private JPanel pTarjetas;
    private JPanel pUno, pDos, pTres, pCuatro, pCinco, pSeis, pSiete, pOcho;
    
    public InicioTemplate(InicioComponent iniciocomponent){
        this.iniciocomponent = iniciocomponent;
        this.sRecursos = RecursosService.getService();
        this.sObjGraficos = ObjGraficosService.getService();
        
        this.crearObjetosDecoradores();
        this.crearJButons();
        this.CrearJpanels();
        
        this.crearContenidopUno();
        this.crearContenidopDos();
        this.crearContenidopTres();
        this.crearContenidopCuatro();
        this.crearContenidopCinco();
        this.crearContenidopSeis();
        this.crearContenidopSiete();
        this.crearContenidopOcho();
//        
        setSize(690, 690);
        this.setBackground(sRecursos.getColorAzulos());
        setLayout(null);
        setVisible(true);
    }
    
    public void CrearJpanels(){
        
        pTarjetas = sObjGraficos.construirJPanel(01, 0, 689, 1053, null, sRecursos.getBorderAbajodel());
        this.add(getpTarjetas());
                
        pUno = sObjGraficos.construirJPanel(01, 10, 690, 132, null, sRecursos.getBorderAbajodel());
        getpTarjetas().add(pUno);
        
        pDos = sObjGraficos.construirJPanel(01, 140, 690, 132, null, sRecursos.getBorderAbajodel());
        getpTarjetas().add(pDos);
        
        pTres = sObjGraficos.construirJPanel(01, 270, 690, 132, null, sRecursos.getBorderAbajodel());
        getpTarjetas().add(pTres);
        
        pCuatro = sObjGraficos.construirJPanel(01, 400, 690, 132, null, sRecursos.getBorderAbajodel());
        getpTarjetas().add(pCuatro);  
        
        pCinco = sObjGraficos.construirJPanel(01, 530, 690, 132, null, sRecursos.getBorderAbajodel());
        getpTarjetas().add(pCinco);
        
        pSeis = sObjGraficos.construirJPanel(01, 660, 690, 132, null, sRecursos.getBorderAbajodel());
        getpTarjetas().add(pSeis);
        
        pSiete = sObjGraficos.construirJPanel(01, 790, 690, 132, null, sRecursos.getBorderAbajodel());
        getpTarjetas().add(pSiete);
        
        pOcho = sObjGraficos.construirJPanel(01, 920, 690, 132, null, sRecursos.getBorderAbajodel());
        getpTarjetas().add(pOcho);  
    }
    
    public void crearObjetosDecoradores() {
        
        iFotop = new ImageIcon("resources/img/perfiles/perfil.png");
        iFotop1 = new ImageIcon("resources/img/perfiles/perfil1.png");
        iFotop2 = new ImageIcon("resources/img/perfiles/perfil2.png");
        iFotop3 = new ImageIcon("resources/img/perfiles/perfil3.png");
        iFotop4 = new ImageIcon("resources/img/perfiles/perfil4.png");
        iFotop5 = new ImageIcon("resources/img/perfiles/perfil10.png");
        iFoto6 = new ImageIcon("resources/img/perfiles/perfil9.png");
        iarriba = new ImageIcon("resources/img/arriba.png");
        iabajo = new ImageIcon("resources/img/abajo.png"); 
    }
    
    public void crearJButons() {
        //Boton subir---------------------------------------------------------------------------------------------------------------------------------------
        iDimaux = new ImageIcon(iarriba.getImage().getScaledInstance(15, 15, Image.SCALE_AREA_AVERAGING));
        
        bArriba = sObjGraficos.construirJButton(
                "", 01, 0, 15, 15, sRecursos.getcMano(), iDimaux, sRecursos.getFontBotNavegador(),
                sRecursos.getColorAzulos(), Color.WHITE, null, true, "l"
        );
        getbArriba().addActionListener(iniciocomponent);
        this.add(bArriba);
        
        //Boton bajar--------------------------------------------------------------------------------------------------------------------------------------
        iDimaux = new ImageIcon(iabajo.getImage().getScaledInstance(15, 15, Image.SCALE_AREA_AVERAGING));
        
        bAbajo = sObjGraficos.construirJButton(
                "", 675, 0, 15, 15, sRecursos.getcMano(), iDimaux, sRecursos.getFontBotNavegador(),
                sRecursos.getColorAzulos(), Color.WHITE, null, true, "l"
        );  
        getbAbajo().addActionListener(iniciocomponent);
        this.add(getbAbajo());
    
    }
    public void crearContenidopUno(){
        this.pUno.add(new TarjetaComponent(
                iFotop1,
                "María_ca",
                "@Maruulanda - 1min",
                "Con el tiempo los panas no son tan panas y está bien"
        ).getTarjetaTemplate());        
    }
    
     public void crearContenidopDos(){
        this.pDos.add(new TarjetaComponent(
                iFotop2,
                "David_Rk",
                "@___deeRick - 3min",
                "Que locha hacer ensayos, nunca he podido hacer una vaina decente"
        ).getTarjetaTemplate());
    }
    
    public void crearContenidopTres(){
        this.pTres.add(new TarjetaComponent(
                iFotop3,
                "DRAMAle",
                "@ValeriaFrank - 23min",
                "Ser mujer puede llegar a ser tan desgastante en una sociedad tan.."
        ).getTarjetaTemplate());
    }
    
    public void crearContenidopCuatro(){
        this.pCuatro.add(new TarjetaComponent(
                iFotop4,
                "Camila(-)",
                "@orenjyi_ - 38min",
                "Me acabo de regalar un tarot de Thoth"
        ).getTarjetaTemplate());
    }   
   
    public void crearContenidopCinco(){
        this.pCinco.add(new TarjetaComponent(
                iFoto6,
                "Sofii_",
                "@LaSrtaSara - 15min",
                "9 de cada 10 audios que envió terminan en un “pero bueno” o un “no sé”"
        ).getTarjetaTemplate());        
    }
    
    public void crearContenidopSeis(){
        this.pSeis.add(new TarjetaComponent(
                iFotop,
                "Valen",
                "@oiga_Tobo_ - 30min",
                "Se siente muy chimba compartir mi vida contigo"
        ).getTarjetaTemplate());        
    }
    
    public void crearContenidopSiete(){
        this.pSiete.add(new TarjetaComponent(
                iFotop5,
                "nanabatman.",
                "@icantfeelbitch - 1h",
                "Mi pasatiempo favorito es viajar en canciones."
        ).getTarjetaTemplate());        
    }
    
    public void crearContenidopOcho(){
        this.pOcho.add(new TarjetaComponent(
                iFoto6,
                "Sofii_",
                "@LaSrtaSara - 2h",
                "Para qué complicarnos si los dos somos felices"
        ).getTarjetaTemplate());        
    }

    public JPanel getpTarjetas() {
        return pTarjetas;
    }

    
    public JButton getbArriba() {
        return bArriba;
    }

    public JButton getbAbajo() {
        return bAbajo;
    }
    
}
