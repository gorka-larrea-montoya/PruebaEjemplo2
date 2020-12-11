package PreparatorioFrankenstein;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

import javax.swing.*;

public class VentanaGeneral extends JFrame{
	
	public static Color COLOR_GRIS_CLARITO = new Color( 220, 220, 220 );
	
		private JDesktopPane escritorio;
		private JLabel labelMensaje = new JLabel(" ");
		private JMenu menuVentanas;
		private JMenu menuAcciones;
		private ArrayList<JInternalFrame> misSubventanas;
		private Runnable runEnCierre;
		
		public VentanaGeneral() {
			misSubventanas = new ArrayList<>();
			setTitle("Ventana General");
			setSize(1200,800);
			setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
			escritorio = new JDesktopPane();
			add(escritorio,BorderLayout.CENTER);
			labelMensaje.setOpaque(true);
			add(labelMensaje,BorderLayout.SOUTH);
			
			addWindowListener(new WindowAdapter() {
				@Override
				public void windowClosed(WindowEvent e) {
					if (runEnCierre != null) {
						runEnCierre.run();
					}
				}
			});
		JMenuBar menuBar = new JMenuBar();
		menuVentanas = new JMenu("Ventanas");
		menuVentanas.setMnemonic(KeyEvent.VK_V);
		menuBar.add(menuVentanas);
		
		menuAcciones = new JMenu("Acciones");
		menuAcciones.setMnemonic(KeyEvent.VK_A);
		menuBar.add(menuAcciones);
		
		setJMenuBar(menuBar);		
		}
	public void setEnCierre(Runnable runnable) {
		runEnCierre = runnable;
	}
	private ActionListener alMenu = new ActionListener() {
		 @Override
		 public void actionPerformed(ActionEvent e) {
			 String vent = e.getActionCommand();
			 for(JInternalFrame vd : misSubventanas) {
				 if (vd.getName().equals(vent)) {
					vd.setVisible(true);
					vd.moveToFront();
					return;
				}
			 }
		 }
	};
	public void addVentanaInterna( JInternalFrame f, String codVentana ) {
		escritorio.add( f );
		JMenuItem menuItem = new JMenuItem(codVentana); 
		menuItem.setActionCommand(codVentana);
		menuItem.addActionListener(alMenu);
		menuVentanas.add( menuItem );	
		misSubventanas.add(f);
		f.setName(codVentana);
	}
	public void setMensaje(String mensaje, Color... colorFondo) {
		//Color fondo = (colorFondo.length>0) ? colorFondo[0] : COLOR_GRIS_CLARITO; 
		Color fondo = null;
		if (colorFondo.length>0) {
			fondo = colorFondo[0];
		}else {
			fondo = COLOR_GRIS_CLARITO;
		}// ASI FUNCIONA EL OPERADOR TERNARIO
		if (mensaje==null || mensaje.isEmpty()) mensaje = " ";
		labelMensaje.setText(mensaje);
		labelMensaje.setBackground(fondo);
	}
	public void setMensajeSinCambioColor(String mensaje) {
		if (mensaje==null || mensaje.isEmpty()) {
			mensaje = " ";
		}
		labelMensaje.setText(mensaje);
	}
	public void addMenuAccion(String textoMenu, ActionListener accion) {
		JMenuItem menuItem = new JMenuItem(textoMenu);
		menuItem.setActionCommand(textoMenu);
		menuItem.addActionListener(accion);
		menuAcciones.add(menuItem);
	}
	public ArrayList<JInternalFrame> getSubventanas() {
		return misSubventanas;
	}
	
	public JDesktopPane getJDesktopPane() {
		return escritorio;
	}
	
	
}
