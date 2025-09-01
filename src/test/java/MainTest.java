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
        Pessoa pessoa = new Pessoa("Ana", 20);
        assertEquals("Ana", pessoa.nome);
        assertEquals(20, pessoa.idade);
    }

    @Test
    public void testeAddPessoa() {
        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa("Ana", 30));
        assertEquals(1, pessoas.size());
        assertEquals("Ana", pessoas.get(0).nome);
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
        pessoas.add(new Pessoa("Alice", 40));
        pessoas.add(new Pessoa("Bia", 22));
        Gson gson = new Gson();
        String json = gson.toJson(pessoas);
        assertTrue(json.contains("Alice"));
        assertTrue(json.contains("Bia"));
    }

    @Test
    public void testePessoaIgualdade() {
        Pessoa p1 = new Pessoa("Lucas", 18);
        Pessoa p2 = new Pessoa("Lucas", 18);
        assertEquals(p1.nome, p2.nome);
        assertEquals(p1.idade, p2.idade);
    }

    @Test
    public void testePessoaDiferenca() {
        Pessoa p1 = new Pessoa("Julia", 28);
        Pessoa p2 = new Pessoa("Julia", 30);
        assertEquals(p1.nome, p2.nome);
        assertNotEquals(p1.idade, p2.idade);
    }

    @Test
    public void testeListaVazia(){
        List<Pessoa> pessoas = new ArrayList<>();
        assertTrue(pessoas.isEmpty());
    }

    @Test
    public void testeListaNaoVazia(){
        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa("Alice", 35));
        pessoas.add(new Pessoa("Bruno", 29));
        pessoas.add(new Pessoa("Clara", 40));
        assertFalse(pessoas.isEmpty());
    }

    @Test
    public void testeSerializacaoListaVazia(){
        List<Pessoa> pessoas = new ArrayList<>();
        Gson gson = new Gson();
        String json = gson.toJson(pessoas);
        assertEquals("[]", json);
    }

    @Test
    public void testeSerializacaoListaComVariosElementos(){
        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa("Alice", 23));
        pessoas.add(new Pessoa("Bruno", 34));
        pessoas.add(new Pessoa("Carla", 29));
        Gson gson = new Gson();
        String json = gson.toJson(pessoas);
        assertTrue(json.contains("Alice"));
        assertTrue(json.contains("Bruno"));
        assertTrue(json.contains("Carla"));
    }

    @Test
    public void testeFalsoPessoaIgualdade() {
        Pessoa p1 = new Pessoa("Lucas", 18);
        Pessoa p2 = new Pessoa("Lucas", 18);
        assertNotEquals(p1.nome, p2.nome);
        assertNotEquals(p1.idade, p2.idade);
    }

    @Test
    public void testeFalsoSerializacaoListaComVariosElementos(){
        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa("Alice", 23));
        pessoas.add(new Pessoa("Bruno", 34));
        pessoas.add(new Pessoa("Carla", 29));
        Gson gson = new Gson();
        String json = gson.toJson(pessoas);
        assertFalse(json.contains("Alice"));
        assertFalse(json.contains("Bruno"));
        assertFalse(json.contains("Carla"));
    }

    @Test
    public void testeFalsoSerializacaoListaVazia(){
        List<Pessoa> pessoas = new ArrayList<>();
        Gson gson = new Gson();
        String json = gson.toJson(pessoas);
        assertNotEquals("[]", json);
    }

    @Test
    public void testeFalsoListaNaoVazia(){
        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa("Alice", 35));
        pessoas.add(new Pessoa("Bruno", 29));
        pessoas.add(new Pessoa("Clara", 40));
        assertTrue(pessoas.isEmpty());
    }

    @Test
    public void testeFalsoListaVazia(){
        List<Pessoa> pessoas = new ArrayList<>();
        assertFalse(pessoas.isEmpty());
    }

    @Test
    public void testeFalsoPessoaDiferenca() {
        Pessoa p1 = new Pessoa("Julia", 28);
        Pessoa p2 = new Pessoa("Julia", 30);
        assertNotEquals(p1.nome, p2.nome);
        assertEquals(p1.idade, p2.idade);
    }

    @Test
    public void testeFalsoCriacao() {
        Pessoa pessoa = new Pessoa("Ana", 20);
        assertNotEquals("Ana", pessoa.nome);
        assertNotEquals(20, pessoa.idade);
    }

    @Test
    public void testeFalsoAddPessoa() {
        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa("Ana", 30));
        assertNotEquals(1, pessoas.size());
        assertNotEquals("Ana", pessoas.get(0).nome);
    }

    @Test
    public void testeFalsoSerializacao() {
        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa("Ana", 25));
        Gson gson = new Gson();
        String json = gson.toJson(pessoas);
        assertFalse(json.contains("Ana"));
        assertFalse(json.contains("25"));
    }

    @Test
    public void testeFalsoSerializacaoMultipla() {
        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa("Alice", 40));
        pessoas.add(new Pessoa("Bia", 22));
        Gson gson = new Gson();
        String json = gson.toJson(pessoas);
        assertFalse(json.contains("Alice"));
        assertFalse(json.contains("Bia"));
    }
}
