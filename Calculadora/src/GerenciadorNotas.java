
public class GerenciadorNotas {
   public static String verificarSituacao(double media) {
        if (media >= 7) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }
}
