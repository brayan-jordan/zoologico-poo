package prova;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class programa {

	public static ArrayList<animais> listaAnimais = new ArrayList<animais>();

	public static void main(String[] args) {

		/* Creating keyboard input */

		Scanner sc = new Scanner(System.in);

		/* Creating variables */

		int rodando = 0, opcao = 0;
		double peso = 0, altura = 0;
		int idade = 0;
		String g = "";
		String nome, subespecie;

		/* Creating an animal of each species */

		listaAnimais.add(new tigre(10.12, 56.12, "Romarinho", 28, "Siberiano", true, "M"));
		listaAnimais.add(new aranha(2.12, 23, "Brayanzito", 12, "Foda", false, "M"));
		listaAnimais.add(new escorpiao(4.12, 93, "Fricasse", 12, "De Fogo", false, "M"));
		listaAnimais.add(new onca(3.12, 63, "A Felina", 52, "Pintada", true, "M"));
		listaAnimais.add(new leao(76.22, 63, "Leao fiu fiu", 52, "Da selva", true, "M"));
		listaAnimais.add(new zebra(76.22, 63, "Zebrita", 52, "Gigante", true, "M"));
		listaAnimais.add(new girafa(76.22, 63, "Pescocuda", 52, "Foda", true, "M"));
		listaAnimais.add(new coala(76.22, 63, "Coalita", 52, "Caneiro", true, "M"));
		listaAnimais.add(new urso(76.22, 63, "Poo", 52, "Rei", true, "M"));
		listaAnimais.add(new ornitorrinco(76.22, 63, "Flash", 52, "Macaco", true, "M"));
		listaAnimais.add(new baleia(76.22, 63, "Frufru", 52, "Jubarte", true, "M"));
		listaAnimais.add(new suricato(76.22, 63, "Suricatito", 52, "Suriquense", true, "M"));
		listaAnimais.add(new javali(76.22, 63, "Porquito", 52, "do Mato", true, "M"));
		listaAnimais.add(new gaviao(76.22, 63, "É o brabo", 52, "Cruel", true, "M"));
		listaAnimais.add(new ema(76.22, 63, "Ema cantante", 52, "Lolo", true, "M"));
		listaAnimais.add(new avestruz(76.22, 63, "Foguetinho", 52, "Faminto", true, "M"));
		listaAnimais.add(new faisao(76.22, 63, "Faisada", 52, "Rei", true, "M"));
		listaAnimais.add(new aguia(76.22, 63, "Fenix", 52, "Rei", true, "M"));
		listaAnimais.add(new pavao(76.22, 63, "Pavao da miguel couto", 52, "Mesclado", true, "M"));
		listaAnimais.add(new pinguim(76.22, 63, "Recruta", 52, "de Madagascar", true, "M"));
		listaAnimais.add(new salmao(76.22, 63, "Peixito", 52, "Laranja", true, "M"));
		listaAnimais.add(new arraia(76.22, 63, "Perigosa", 52, "Suprema", true, "M"));
		listaAnimais.add(new tubarao(76.22, 63, "Baby Shark", 52, "Martelo", true, "M"));
		listaAnimais.add(new baiacu(76.22, 63, "Espinhoso", 52, "Espinhoso", true, "M"));
		listaAnimais.add(new jacare(76.22, 63, "Cocodigrilo", 52, "Da africa", true, "M"));
		listaAnimais.add(new crocodilo(76.22, 63, "Cocodigriilo", 52, "Do rio nilo", true, "M"));
		listaAnimais.add(new tartaruga(76.22, 63, "Tartaruga Ninja", 52, "Ninja demais", true, "M"));
		listaAnimais.add(new cobra(76.22, 63, "A gigante", 52, "Anaconda", true, "M"));
		listaAnimais.add(new iguana(76.22, 63, "Iguana1", 52, "Suprema", true, "M"));
		listaAnimais.add(new ra(76.22, 63, "Ra1", 52, "Feroz", true, "M"));
		listaAnimais.add(new sapo(76.22, 63, "Sapo1", 52, "Rei", true, "M"));
		listaAnimais.add(new salamandra(76.22, 63, "Salamandra1", 52, "Rei", true, "M"));

		/* Main program */

		System.out.println("BEM VINDO AO PROGRAMA");
		while (rodando == 0) {

			System.out.println(
					"MENU: \n1- CADASTRAR ANIMAL \n2- EXCLUIR ANIMAL \n3- EDITAR UM ANIMAL\n4- LISTAR OS ANIMAIS \n5- ENCERRAR");
			opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o numero: "));

			switch (opcao) {

			case 1:
				System.out.println(
						"MENU DE CADASTRO DE ANIMAIS: \nVOCÊ DESEJA CADASTRAR QUE TIPO DE ANIMAL? \n1- INVERTEBRADO \n2- VERTEBRADO");
				opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o numero: "));
				switch (opcao) {

				case 1:
					System.out.println("VOCÊ ESCOLHEU INVERTEBRADO \nAGORA INSIRA ALGUMAS INFORMAÇÕES DO ANIMAL:");
					System.out.println("QUAL TAMANHO DO ANIMAL?");
					altura = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a altura: "));
					System.out.println("QUAL PESO DO ANIMAL?");
					peso = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a peso: "));
					System.out.println("QUAL NOME DO ANIMAL?");
					nome = JOptionPane.showInputDialog("Digite o nome");
					if (verificaExistente(nome) == -1) {
						System.out.println("QUAL A IDADE DO ANIMAL?");
						idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o numero: "));
						System.out.println("QUAL O GENERO DO ANIMAL? (M ou F)");
						g = JOptionPane.showInputDialog("GENERO (F OU M)");
						System.out.println("DESEJA CADASTRAR QUAL INVERTEBRADO? \n1- ARANHA \n2- ESCORPIAO");
						opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o numero: "));

					} else {
						opcao = 0;
						System.out.println("JA EXISTE UM ANIMAL COM ESSE NOME");
					}

					if (opcao == 1) {
						System.out.println("QUAL A SUB-ESPECIE DESSA ARANHA? ");
						subespecie = JOptionPane.showInputDialog("INSIRA A SUBESPECIE");
						listaAnimais.add(new aranha(altura, peso, nome, idade, subespecie, false, g));

					} else if (opcao == 2) {
						System.out.println("QUAL A SUB-ESPECIE DESSA ESCORPIAO? ");
						subespecie = JOptionPane.showInputDialog("INSIRA A SUBESPECIE");
						listaAnimais.add(new escorpiao(altura, peso, nome, idade, subespecie, false, g));
					} else {
						System.out.println("ERRROOO");
					}

					break;
				case 2:
					System.out.println("VOCÊ ESCOLHEU VERTEBRADO \nAGORA INSIRA ALGUMAS INFORMAÇÕES DO ANIMAL:");
					System.out.println("QUAL TAMANHO DO ANIMAL?");
					altura = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a altura: "));
					System.out.println("QUAL PESO DO ANIMAL?");
					peso = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a peso: "));
					System.out.println("QUAL NOME DO ANIMAL?");
					nome = JOptionPane.showInputDialog("Digite o nome");
					if (verificaExistente(nome) == -1) {
						System.out.println("QUAL A IDADE DO ANIMAL?");
						idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o numero: "));
						System.out.println("QUAL O GENERO DO ANIMAL? (M ou F)");
						g = JOptionPane.showInputDialog("GENERO (F OU M)");
						System.out.println(
								"ESSE VERTEBRADO PERTENCE A QUAL ESPÉCIE? \n1- MAMIFEROS \n2- AVES \n3- PEIXES \n4- REPTEIS \n5- ANFIBIOS");
						opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o numero: "));

					} else {
						opcao = 0;
						System.out.println("JA EXISTE UM ANIMAL COM ESSE NOME");
					}
					switch (opcao) {

					case 1:
						System.out.println(
								"QUAL O TIPO DESSE MAMIFERO? \n1- TIGRE \n2- ONCA\n3- LEAO\n4- ZEBRA\n5- GIRAFA\n6- COALA\n7- URSO\n8- ORNITORRINCO\n9- BALEIA\n10- SURICATO\n11- JAVALI");
						opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o numero: "));
						switch (opcao) {
						case 1:
							System.out.println("QUAL A SUBESPECIE DESSE TIGRE?");
							subespecie = JOptionPane.showInputDialog("INSIRA A SUBESPECIE");
							listaAnimais.add(new tigre(altura, peso, nome, idade, subespecie, true, g));
							break;
						case 2:
							System.out.println("QUAL A SUBESPECIE DESSA ONCA?");
							subespecie = JOptionPane.showInputDialog("INSIRA A SUBESPECIE");
							listaAnimais.add(new onca(altura, peso, nome, idade, subespecie, true, g));
							break;
						case 3:
							System.out.println("QUAL A SUBESPECIE DESSE LEAO?");
							subespecie = JOptionPane.showInputDialog("INSIRA A SUBESPECIE");
							listaAnimais.add(new leao(altura, peso, nome, idade, subespecie, true, g));
							break;
						case 4:
							System.out.println("QUAL A SUBESPECIE DESSA ZEBRA?");
							subespecie = JOptionPane.showInputDialog("INSIRA A SUBESPECIE");
							listaAnimais.add(new zebra(altura, peso, nome, idade, subespecie, true, g));
							break;
						case 5:
							System.out.println("QUAL A SUBESPECIE DESSA GIRAFA?");
							subespecie = JOptionPane.showInputDialog("INSIRA A SUBESPECIE");
							listaAnimais.add(new girafa(altura, peso, nome, idade, subespecie, true, g));
							break;
						case 6:
							System.out.println("QUAL A SUBESPECIE DESSE COALA?");
							subespecie = JOptionPane.showInputDialog("INSIRA A SUBESPECIE");
							listaAnimais.add(new coala(altura, peso, nome, idade, subespecie, true, g));
							break;
						case 7:
							System.out.println("QUAL A SUBESPECIE DESSE URSO?");
							subespecie = JOptionPane.showInputDialog("INSIRA A SUBESPECIE");
							listaAnimais.add(new urso(altura, peso, nome, idade, subespecie, true, g));
							break;
						case 8:
							System.out.println("QUAL A SUBESPECIE DESSE ORNITORRINCO?");
							subespecie = JOptionPane.showInputDialog("INSIRA A SUBESPECIE");
							listaAnimais.add(new ornitorrinco(altura, peso, nome, idade, subespecie, true, g));
							break;
						case 9:
							System.out.println("QUAL A SUBESPECIE DESSA BALEIA?");
							subespecie = JOptionPane.showInputDialog("INSIRA A SUBESPECIE");
							listaAnimais.add(new baleia(altura, peso, nome, idade, subespecie, true, g));
							break;
						case 10:
							System.out.println("QUAL A SUBESPECIE DESSE SURICATO?");
							subespecie = JOptionPane.showInputDialog("INSIRA A SUBESPECIE");
							listaAnimais.add(new suricato(altura, peso, nome, idade, subespecie, true, g));
							break;
						case 11:
							System.out.println("QUAL A SUBESPECIE DESSE JAVALI?");
							subespecie = JOptionPane.showInputDialog("INSIRA A SUBESPECIE");
							listaAnimais.add(new javali(altura, peso, nome, idade, subespecie, true, g));
							break;
						default:
							System.out.println("ERRO, TENTE NOVAMENTE");
							break;
						}
						break;
					case 2:
						System.out.println(
								"QUAL O TIPO DESSA AVE? \n1- GAVIAO\n2- EMA\n3- AVESTRUZ\n4- FAISAO\n5- AGUIA\n6- PAVAO\n7- PINGUIM");
						opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o numero: "));
						switch (opcao) {
						case 1:
							System.out.println("QUAL A SUBESPECIE DESSE GAVIAO");
							subespecie = JOptionPane.showInputDialog("INSIRA A SUBESPECIE");
							listaAnimais.add(new gaviao(altura, peso, nome, idade, subespecie, true, g));
							break;
						case 2:
							System.out.println("QUAL A SUBESPECIE DESSA EMA?");
							subespecie = JOptionPane.showInputDialog("INSIRA A SUBESPECIE");
							listaAnimais.add(new ema(altura, peso, nome, idade, subespecie, true, g));
							break;
						case 3:
							System.out.println("QUAL A SUBESPECIE DESSE AVESTRUZ?");
							subespecie = JOptionPane.showInputDialog("INSIRA A SUBESPECIE");
							listaAnimais.add(new avestruz(altura, peso, nome, idade, subespecie, true, g));
							break;
						case 4:
							System.out.println("QUAL A SUBESPECIE DESSA FAISAO?");
							subespecie = JOptionPane.showInputDialog("INSIRA A SUBESPECIE");
							listaAnimais.add(new faisao(altura, peso, nome, idade, subespecie, true, g));
							break;
						case 5:
							System.out.println("QUAL A SUBESPECIE DESSA AGUIA?");
							subespecie = JOptionPane.showInputDialog("INSIRA A SUBESPECIE");
							listaAnimais.add(new aguia(altura, peso, nome, idade, subespecie, true, g));
							break;
						case 6:
							System.out.println("QUAL A SUBESPECIE DESSE PAVAO?");
							subespecie = JOptionPane.showInputDialog("INSIRA A SUBESPECIE");
							listaAnimais.add(new pavao(altura, peso, nome, idade, subespecie, true, g));
							break;
						case 7:
							System.out.println("QUAL A SUBESPECIE DESSE PINGUIM?");
							subespecie = JOptionPane.showInputDialog("INSIRA A SUBESPECIE");
							listaAnimais.add(new pinguim(altura, peso, nome, idade, subespecie, true, g));
							break;
						default:
							System.out.println("ERRO, TENTE NOVAMENTE");
							break;
						}
						break;
					case 3:
						System.out.println("QUAL O TIPO DESSE PEIXE? \n1- GAVIAO\n2- EMA\n3- AVESTRUZ\n4- FAISAO");
						opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o numero: "));
						switch (opcao) {
						case 1:
							System.out.println("QUAL A SUBESPECIE DESSE SALMAO");
							subespecie = JOptionPane.showInputDialog("INSIRA A SUBESPECIE");
							listaAnimais.add(new salmao(altura, peso, nome, idade, subespecie, true, g));
							break;
						case 2:
							System.out.println("QUAL A SUBESPECIE DESSA ARRAIA?");
							subespecie = JOptionPane.showInputDialog("INSIRA A SUBESPECIE");
							listaAnimais.add(new arraia(altura, peso, nome, idade, subespecie, true, g));
							break;
						case 3:
							System.out.println("QUAL A SUBESPECIE DESSE TUBARAO?");
							subespecie = JOptionPane.showInputDialog("INSIRA A SUBESPECIE");
							listaAnimais.add(new tubarao(altura, peso, nome, idade, subespecie, true, g));
							break;
						case 4:
							System.out.println("QUAL A SUBESPECIE DESSE BAIACU?");
							subespecie = JOptionPane.showInputDialog("INSIRA A SUBESPECIE");
							listaAnimais.add(new baiacu(altura, peso, nome, idade, subespecie, true, g));
							break;
						default:
							System.out.println("ERRO, TENTE NOVAMENTE");
							break;
						}
						break;
					case 4:
						System.out.println(
								"QUAL O TIPO DESSE REPTIL? \n1- JACARÉ\n2- CROCODILO\n3- TARTARUGA\n4- COBRA\n5- IGUANA");
						opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o numero: "));
						switch (opcao) {
						case 1:
							System.out.println("QUAL A SUBESPECIE DESSE JACARE?");
							subespecie = JOptionPane.showInputDialog("INSIRA A SUBESPECIE");
							listaAnimais.add(new jacare(altura, peso, nome, idade, subespecie, true, g));
							break;
						case 2:
							System.out.println("QUAL A SUBESPECIE DESSE CROCODILO?");
							subespecie = JOptionPane.showInputDialog("INSIRA A SUBESPECIE");
							listaAnimais.add(new crocodilo(altura, peso, nome, idade, subespecie, true, g));
							break;
						case 3:
							System.out.println("QUAL A SUBESPECIE DESSA TARTARUGA?");
							subespecie = JOptionPane.showInputDialog("INSIRA A SUBESPECIE");
							listaAnimais.add(new tartaruga(altura, peso, nome, idade, subespecie, true, g));
							break;
						case 4:
							System.out.println("QUAL A SUBESPECIE DESSA COBRA?");
							subespecie = JOptionPane.showInputDialog("INSIRA A SUBESPECIE");
							listaAnimais.add(new cobra(altura, peso, nome, idade, subespecie, true, g));
							break;
						case 5:
							System.out.println("QUAL A SUBESPECIE DESSA IGUANA?");
							subespecie = JOptionPane.showInputDialog("INSIRA A SUBESPECIE");
							listaAnimais.add(new iguana(altura, peso, nome, idade, subespecie, true, g));
							break;
						default:
							System.out.println("ERRO, TENTE NOVAMENTE");
							break;
						}
						break;
					case 5:
						System.out.println("QUAL O TIPO DESSE ANFIBIO? \n1- RÃ\n2- SAPO\n3- SALAMANDRA");
						opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o numero: "));
						switch (opcao) {
						case 1:
							System.out.println("QUAL A SUBESPECIE DESSA RÃ?");
							subespecie = JOptionPane.showInputDialog("INSIRA A SUBESPECIE");
							listaAnimais.add(new ra(altura, peso, nome, idade, subespecie, true, g));
							break;
						case 2:
							System.out.println("QUAL A SUBESPECIE DESSE SAPO?");
							subespecie = JOptionPane.showInputDialog("INSIRA A SUBESPECIE");
							listaAnimais.add(new sapo(altura, peso, nome, idade, subespecie, true, g));
							break;
						case 3:
							System.out.println("QUAL A SUBESPECIE DESSA SALAMANDRA?");
							subespecie = JOptionPane.showInputDialog("INSIRA A SUBESPECIE");
							listaAnimais.add(new salamandra(altura, peso, nome, idade, subespecie, true, g));
							break;
						default:
							System.out.println("ERRO, TENTE NOVAMENTE");
							break;
						}
						break;
					default:
						break;

					}
					break;
				}
				if (opcao > 0) {
					System.out.println("Animal cadastrado com sucesso");
				} else {
				}
				break;
			case 2:
				System.out.println("Insira o nome do animal que você deseja excluir?");
				String nomeExcluir = JOptionPane.showInputDialog("NOME DO ANIMAL A SER EXCLUIDO:");
				if (verificaExistente(nomeExcluir) == -1) {
					System.out.println("Não existe um usuario com esse id");

				} else {
					listaAnimais.remove(verificaExistente(nomeExcluir));
					System.out.println("Animal removido com sucesso");
				}
				break;

			case 3:
				System.out.println("Insira o nome do animal que você deseja EDITAR?");
				String nomeEditar = JOptionPane.showInputDialog("NOME DO ANIMAL A SER EDITADO:");
				if (verificaExistente(nomeEditar) == -1) {
					System.out.println("Não existe um usuario com esse id");

				} else {
					System.out.println("Insira o novo peso do animal:");
					peso = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o novo peso: "));
					System.out.println("Insira o novo tamanho do animal");
					altura = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a nova altura: "));
					System.out.println("Insira a idade atualizada do animal");
					idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a nova idade: "));
					listaAnimais.get(verificaExistente(nomeEditar)).setIdade(idade);
					listaAnimais.get(verificaExistente(nomeEditar)).setTamanho(altura);
					listaAnimais.get(verificaExistente(nomeEditar)).setPeso(peso);
					System.out.println(
							"As credenciais do animal" + listaAnimais.get(verificaExistente(nomeEditar)).getNome()
									+ "foram atualizadas com sucesso!");
				}
				break;
			case 5:
				System.out.println("SISTEMA ENCERRADO!");
				System.exit(0);
			case 4:
				System.out.println("SISTEMA DE CONSULTA");
				System.out.println(
						"Qual espécie de animal você deseja consultar?\n (Não esqueça de inserir letra maiuscula e verificar a ortografia");
				String consulta = JOptionPane.showInputDialog("ESPECIE PARA CONSULTA:");
				System.out.println("Listando todos os animais da espécie: " + consulta + "\n");
				int contador = 0;
				for (int i = 0; i < listaAnimais.size(); ++i) {
					if (listaAnimais.get(i).getTipo2().equals(consulta)) {
						contador++;
						System.out.println("\n --------------- \n");
						System.out.println("Animal: " + contador + ": ");
						System.out.println("NOME: " + listaAnimais.get(i).getNome());
						System.out.println("SUB ESPECIE: " + listaAnimais.get(i).getSubespecie());
						System.out.printf("PESO: %.2f %n", listaAnimais.get(i).getPeso());
						System.out.printf("TAMANHO: %.2f %n", listaAnimais.get(i).getTamanho());
						System.out.println("IDADE: " + listaAnimais.get(i).getIdade());
						System.out.println("GENERO: " + listaAnimais.get(i).getG());
						System.out.println("\n ---------------");

					}
				}
				break;
			default:
				System.out.println("ERRO");
				break;

			}

		}

		sc.close();

	}

	public static int verificaExistente(String nome) {
		int indice = -1;
		for (int i = 0; i < listaAnimais.size(); ++i) {
			if (listaAnimais.get(i).getNome().equals(nome)) {
				indice = i;
			}
		}
		return indice;
	}

}
