package MainEscola;

import Model.Escola;
import Visual.CadastroAlunos;
import Visual.GerenciadorAlunos;
import Visual.TelaPrincipal;

public class MainEscola {

    public static void main(String[] args) {
        Escola escola = new Escola();

        TelaPrincipal tela = new TelaPrincipal(escola);
        tela.setVisible(true);
    }

}
