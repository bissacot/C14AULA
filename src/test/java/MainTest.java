import org.example.Main;
import org.example.Pessoa;
import com.google.gson.Gson;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void testeCriacao() {
        Pessoa pessoa = new Pessoa("Joao", 20);
        assertEquals("Joao", pessoa.nome);
        assertEquals(20, pessoa.idade);
    }

    @Test
    public void testeAddPessoa() {
        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa("Maria", 30));
        assertEquals(1, pessoas.size());
        assertEquals("Maria", pessoas.get(0).nome);
    }

    @Test
    public void testeSerializacao() {
        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa("Ana", 25));
        Gson gson = new Gson();
        String json = gson.toJson(pessoas);
        assertTrue(json.contains("Ana"));
        assertTrue(json.contains("25"));
    }

    @Test
    public void testeSerializacaoMultipla() {
        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa("Carlos", 40));
        pessoas.add(new Pessoa("Bia", 22));
        Gson gson = new Gson();
        String json = gson.toJson(pessoas);
        assertTrue(json.contains("Carlos"));
        assertTrue(json.contains("Bia"));
    }

    @Test
    public void testePessoaIgualdade() {
        Pessoa p1 = new Pessoa("Lucas", 18);
        Pessoa p2 = new Pessoa("Lucas", 18);
        assertEquals(p1.nome, p2.nome);
        assertEquals(p1.idade, p2.idade);
    }
}