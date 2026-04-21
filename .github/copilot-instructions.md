# Barber Alerta — Diretrizes do Projeto

Projeto de **aprendizado de Java orientado a objetos** com front-end HTML/CSS. Simula um sistema de agendamento para barbearia.

## Arquitetura

```
src/        → código-fonte Java
web/        → front-end estático (HTML + CSS)
out/        → bytecode compilado (.class) — não versionar
.github/    → configurações do Copilot
```

| Arquivo | Papel |
|---|---|
| `src/Cliente.java` | POJO de cliente (nome, telefone) |
| `src/Agendamento.java` | POJO de agendamento; referencia `Cliente` por composição |
| `src/BarberAlerta.java` | Classe principal com `main()` — ponto de entrada do programa |
| `web/barberAlert.html` | Formulário de agendamento (front-end estático) |
| `web/style.css` | Estilos do HTML |

## Estilo de Código (Java)

- **Idioma**: comentários e nomes de variáveis em **português** (ex.: `nome`, `horario`, `setServico`)
- **Classes**: PascalCase — `Cliente`, `Agendamento`, `BarberAlerta`
- **Atributos e métodos**: camelCase — `getNome()`, `setTelefone()`
- **POJOs** seguem o padrão: construtor vazio + getters/setters explícitos (sem Lombok)
- Campos sem modificador de acesso explícito (package-private) são aceitáveis neste projeto de treino

## Convenções HTML/CSS

- Formulário em `barberAlert.html` captura: nome, telefone, serviço (`<select>`), data, horário, observação
- Estilo centralizado em `style.css`

## Build e Execução

Sem build tool configurado. Compilar e executar manualmente a partir da raiz do projeto:

```bash
# Compilar (gera .class em out/)
javac -d out src/*.java

# Executar
java -cp out BarberAlerta
```

## O que evitar

- Não adicionar frameworks (Spring, Maven, etc.) sem solicitação explícita
- Não converter para anotações (`@Getter`, `@Setter`) sem pedido — este é um projeto didático com POJOs explícitos
- Não remover comentários em português que explicam o código — são intencionais para aprendizado
