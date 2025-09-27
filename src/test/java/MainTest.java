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
    public void testPessoaWithZeroAge() {
        Pessoa pessoa = new Pessoa("Beto", 0);
        assertEquals(0, pessoa.idade);
    }

    @Test
    public void testPessoaWithNegativeAge() {
        Pessoa pessoa = new Pessoa("Tina", -5);
        assertEquals(-5, pessoa.idade);
    }

    @Test
    public void testPessoaWithEmptyName() {
        Pessoa pessoa = new Pessoa("", 18);
        assertEquals("", pessoa.nome);
    }

    @Test
    public void testPessoaWithLongName() {
        String longName = "A".repeat(100);
        Pessoa pessoa = new Pessoa(longName, 50);
        assertEquals(longName, pessoa.nome);
    }

    @Test
    public void testPessoaListClear() {
        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa("Ana", 20));
        pessoas.add(new Pessoa("Bia", 21));
        pessoas.clear();
        assertTrue(pessoas.isEmpty());
    }

    @Test
    public void testPessoaToJsonSingle() {
        Pessoa pessoa = new Pessoa("Carlos", 45);
        Gson gson = new Gson();
        String json = gson.toJson(pessoa);
        assertTrue(json.contains("Carlos"));
        assertTrue(json.contains("45"));
    }

    @Test
    public void testPessoaListSizeAfterAddAndRemove() {
        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa("Ana", 25));
        pessoas.add(new Pessoa("Bruno", 30));
        pessoas.remove(0);
        assertEquals(1, pessoas.size());
        assertEquals("Bruno", pessoas.get(0).nome);
    }

    @Test
    public void testJsonContainsAllFields() {
        Pessoa pessoa = new Pessoa("Marina", 27);
        Gson gson = new Gson();
        String json = gson.toJson(pessoa);
        assertTrue(json.contains("nome"));
        assertTrue(json.contains("idade"));
    }

    @Test
    public void testMultiplePeopleSameNameDifferentAge() {
        Pessoa p1 = new Pessoa("Rafael", 20);
        Pessoa p2 = new Pessoa("Rafael", 35);
        assertEquals(p1.nome, p2.nome);
        assertNotEquals(p1.idade, p2.idade);
    }

    @Test
    public void testLargeListSerialization() {
        List<Pessoa> pessoas = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            pessoas.add(new Pessoa("Pessoa" + i, i));
        }
        Gson gson = new Gson();
        String json = gson.toJson(pessoas);
        assertTrue(json.contains("Pessoa0"));
        assertTrue(json.contains("Pessoa49"));
        assertEquals(50, pessoas.size());
    }

        
}
