// ESTRUTURA IF ELSE SWITCH - EXERCICIO 17 JAVA (UNISUL)

package ws.estruturaifswitch1;
import javax.swing.JOptionPane;
public class Estruturaifswitch1 {

    public static void main(String[] args) {
        String profissao = JOptionPane.showInputDialog("Profissão " + "\n e- engenheiro \n m- medico \n d- designer \n p- programador \n a- advogado");
        char profissaoCHAR = profissao.charAt(0);
        
        switch (profissaoCHAR) {
                
            case 'e':
                JOptionPane.showMessageDialog(null, "Tibúrcio é engenheiro");
                break;
            
            case 'm':
                JOptionPane.showMessageDialog(null, "Tibúrcio é médico");
                break;
            case 'd':
                JOptionPane.showMessageDialog(null, "Tibúrcio é designer");
                break;
            case 'p':
                JOptionPane.showMessageDialog(null, "Tibúrcio é programador");
                break;
            case 'a':
                JOptionPane.showMessageDialog(null, "Tibúrcio é advogado");
                break;
            
        }
       
        
        
    }
}
