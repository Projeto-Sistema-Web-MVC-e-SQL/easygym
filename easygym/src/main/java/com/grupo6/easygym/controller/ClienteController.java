package com.grupo6.easygym.controller;

import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.grupo6.easygym.dao.ClienteDAO;
import com.grupo6.easygym.dao.FuncionarioDAO;
import com.grupo6.easygym.modelo.Cliente;
import com.grupo6.easygym.modelo.Funcionario;

@Controller
public class ClienteController {
	private ClienteDAO clienteDAO;
	private FuncionarioDAO funcionarioDAO;

	public ClienteController() {
		super();
		clienteDAO = new ClienteDAO();
		funcionarioDAO = new FuncionarioDAO();
	}

	@GetMapping("/clientes")
	public String exibeFormNovoCliente(Model model) {
		Cliente cliente = new Cliente();
		List<Funcionario> lista = funcionarioDAO.todos();
		model.addAttribute("cliente", cliente);
		model.addAttribute("listaDeFuncionarios", lista);
		return "clientes";
	}

	@PostMapping("/clientes")
	public String gravaCliente(Cliente cliente) {
		if (cliente.getId() == null) {
			ClienteDAO clienteDAO = new ClienteDAO();
			clienteDAO.inserir(cliente);
		} else {
			clienteDAO.atualizar(cliente);
		}
		return "redirect:/ger-clientes";
	}

	@GetMapping("/ger-clientes")
	public String exibeTabelaTodosClientes(Model modelo) {
		List<Cliente> lista = clienteDAO.todos();
		modelo.addAttribute("listaDeClientes", lista);
		return "ger-clientes";
	}

	@GetMapping("/excluir")
	public String deletar(@RequestParam("id") int i) {
		clienteDAO.deletar(i);
		return "redirect:/ger-clientes";
	}

	@RequestMapping("/edit-cliente")
	public String exibeFormEditCliente(@RequestParam("id") int i, Model model) {
		Cliente cliente = clienteDAO.buscaPorId(i);
		List<Funcionario> lista = funcionarioDAO.todos();
		model.addAttribute("cliente", cliente);
		model.addAttribute("listaDeFuncionarios", lista);
		return "clientes";
	}

	@RequestMapping("/vis-cliente")
	public String pg12() {
		return "vis-cliente";
	}
}
