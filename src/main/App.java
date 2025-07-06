package main;

import java.util.List;

import main.Ejercicio_01_insert.InsertBSTTest;
import main.Ejercicio_02_invert.InvertBinaryTree;
import main.Ejercicio_03_listLeves.ListLevels;
import main.Ejercicio_04_depth.Depth;
import main.Materia.Controllers.ArbolBinario;
import main.Materia.Models.Node;
import utils.StudentValidator;

    public class App {
        public static void main(String[] args) throws Exception {
//-----------------------------------------------------------------------------
            System.out.println("---------------Programa funcionando---------------");
//-----------------------------------------------------------------------------
            // NO MODIFICAR ESTE CÓDIGO
            var estudiante = StudentValidator.validarDatos();
            System.out.println("👤 Estudiante: " + estudiante.nombre());
            System.out.println("✉️  Correo: " + estudiante.correo());
            // NO MODIFICAR HASTA AQUÍ
//-----------------------------------------------------------------------------
            int[] lista = {5, 3, 7, 2, 4, 6, 8};
            Node root = null;
            ArbolBinario print = new ArbolBinario();
//-----------------------------------------------------------------------------
            System.out.println("\nEjercicio 01: Insertar en un Árbol Binario de Búsqueda (BST)\n");
            InsertBSTTest insert = new InsertBSTTest();
            
            for (int valor: lista){
                root = insert.insert(root, valor);
            }
            print.printTreeNode2(root," ",true);

            System.out.println("------------------------------------------------------------------------------\n");
//-----------------------------------------------------------------------------
            System.out.println("Ejercicio 02: Invertir un Árbol Binario\n");

            System.out.println("Arbol normal");
            print.printTreeNode2(root," ",true);

            InvertBinaryTree invertir = new InvertBinaryTree();

            Node invertido = invertir.invertTree(root);

            System.out.println("Arbol invertido");
            print.printTreeNode2(invertido, "", true);

            System.out.println("------------------------------------------------------------------------------\n");
//-----------------------------------------------------------------------------
            System.out.println("Ejercicio 03: Listar Niveles en Listas Enlazadas\n");

            System.out.println("Arbol normal");
            print.printTreeNode2(root," ",true);

            ListLevels listaNiveles = new ListLevels();

            List<List<Node>> niveles = listaNiveles.listLevels(root);

            for (List<Node> level : niveles) {
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < level.size(); i++) {
                    sb.append(level.get(i).getValue());
                    if (i < level.size() - 1) sb.append(" -> ");
                }
                System.out.println(sb);
            }
            System.out.println("------------------------------------------------------------------------------\n");
//-----------------------------------------------------------------------------
            System.out.println("Ejercicio 04: Calcular la Profundidad Máxima\n");
            Depth max = new Depth();
            int profundidad = max.maxDepth(root);

            System.out.println("Profundidad es de: " + profundidad);
        }

    }
