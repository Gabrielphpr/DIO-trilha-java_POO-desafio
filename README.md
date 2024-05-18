# DIO-trilha-java_POO-desafio:
Com base no vídeo de [lançamento do iPhone de 2007](https://www.youtube.com/watch?v=9ou608QQRq8), você deve elaborar a diagramação das classes e interfaces utilizando uma ferramenta UML. Em seguida, implemente as classes e interfaces no formato de arquivos `.java`.

## Diagrama UML (Mermaid)
```mermaid
classDiagram
    class ReprodutorMusical {
        <<Interface>>
        +Tocar()
        +Pausar()
        +SelecionarMusica(String musica)
    }

    class AparelhoTelefonico {
        <<Interface>>
        +Ligar(String Nome)
        +Atender()
        +IniciarCorreioDeVoz(String exemplo)
    }

    class NavegadorInternet {
        <<Interface>>
        +ExibirPagina(String url)
        +AdicionarNovaAba()
        +AtualizarPagina()
    }

    class iPhone {
    }

    iPhone --> ReprodutorMusical
    iPhone --> AparelhoTelefonico
    iPhone --> NavegadorInternet
```
