package program;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

import javax.xml.crypto.Data;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        Scanner scan = new Scanner(System.in);
        List <Product> produtos = new ArrayList<Product>();

        System.out.print("Informe a Quantidade de Produtos: ");
        int qde = scan.nextInt();

        for (int i=0;i<=qde; i++){
            scan.nextLine();
            System.out.print("Nome Do Produto: ");
            String nome = scan.nextLine();
            System.out.print("Preço do Produto: ");
            double price = scan.nextDouble();
            scan.nextLine();
            System.out.print("Produto usado? [s/n] ");
            char usado = scan.next().charAt(0);
            if(usado == 's' || usado=='S'){
                String data;
                System.out.print("Informa a data 'dd/MM/aaaa': ");
                data = scan.next();
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                Date d = (Date) sdf.parse(data);

                UsedProduct usedProduct = new UsedProduct(nome, price, d);
                produtos.add(usedProduct);

            }else{

                System.out.print("preço de Alfandega: ");
                double imposto = scan.nextDouble();
                ImportedProduct imp = new ImportedProduct(nome, price, imposto);
                produtos.add(imp);
            }

        }


        System.out.println("=====Produtos Informados======");
        for(Product p: produtos){
            System.out.println("Nome " + p.getName() + " Preço: " + p.getPrice());

        }




    }
    public static void funcion(Scanner scan) throws ParseException {


    }
}
