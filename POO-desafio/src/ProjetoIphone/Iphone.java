package ProjetoIphone;

import java.util.Scanner;

import ProjetoIphone.Funcionalidades.AparelhoTelefonico;
import ProjetoIphone.Funcionalidades.NavegadorInternet;
import ProjetoIphone.Funcionalidades.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical{
    Scanner scanner = new Scanner(System.in);
    public void Tocar(){
        System.out.println("Tocando musica selecionada");
    }
    public void Pausar(){
        System.out.println("Pausando musica selecionada");
    }
    public void SelecionarMusica(String musicaRequerida){
        System.out.println("Musica escolhida: " + musicaRequerida);
    }
    public void Ligar(String Nome){
        System.out.println("Ligando para" + Nome);
    }
    public void Atender(){
        System.out.println("Chamada para você! Atender?");
        String atender = scanner.nextLine();
        if(atender=="sim") System.out.println("Conectado");
        else if(atender=="nao") System.out.println("Chamada recusada");
    }
    public void IniciarCorreioDeVoz(){
        System.out.println("Correio de Voz iniciado...");
        System.out.println("Correio de Voz finalizado!");
    }
    public void ExibirPagina(String URL){
        System.out.println("Acessando " + URL);
    }
    public void AdicionarPagina(){
        System.out.println("Qual pagina deseja acessar?");
        ExibirPagina(scanner.nextLine());
    }
    public void AtualizarPagina(){
        System.out.println("Atualizando pagina...");
        System.out.println("Pagina atualizada");
    }
}
