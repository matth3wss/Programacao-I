import java.util.ArrayList;
import java.util.Scanner;

public class Blog {
    private ArrayList<Post> posts = new ArrayList<Post>();

    public void showAll() {
        if (posts.isEmpty())
            System.out.println("O blog não possui nenhuma postagem\n");
        else
            for (Post post : posts)
                post.show();
    }

    public void readData(Post post, Scanner sc) {
        sc.nextLine();
        System.out.println("Título do post: ");
        post.setTitle(sc.nextLine());
        System.out.println("Conteúdo do post: ");
        post.setContent((sc.nextLine()));
        post.setDate();

        if (post instanceof News) {
            System.out.println("Fonte: ");
            ((News) post).setSource(sc.nextLine());
        } else if (post instanceof ProductReview) {
            System.out.println("Marca do produto: ");
            ((ProductReview) post).setBrand(sc.nextLine());

            System.out.println("Avalição do produto, 1 a 10 estrelas: ");
            ((ProductReview) post).evaluate(sc.nextInt());
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Menu op = new Menu();
        Blog blog = new Blog();
        int menu = 0;

        while (menu != 10) {
            menu = op.menu(sc);
            switch (menu) {
                case 1:
                    News news = new News();
                    Post postNews = news;
                    blog.readData(postNews, sc);
                    blog.posts.add(postNews);
                    break;

                case 2:
                    ProductReview productReview = new ProductReview();
                    Post postProductReview = productReview;
                    blog.readData(postProductReview, sc);
                    blog.posts.add(postProductReview);
                    break;

                case 3:
                    Post genericPost = new Post();
                    blog.readData(genericPost, sc);
                    blog.posts.add(genericPost);
                    break;

                case 4:
                    blog.showAll();
                    break;

                case 5:
                    if (blog.posts.isEmpty()) {
                        System.out.println("Nenhum post foi realizado!\n");
                        break;
                    } else {
                        System.out.println("Digite o indice do post: ");
                        int index = sc.nextInt();
                        sc.nextLine();
                        try {
                            blog.posts.get(index).like();
                            System.out.println("Postagem curtida\n");

                        } catch (IndexOutOfBoundsException e) {
                            System.out.println("Indice fora dos limites do ArrayList");
                        }
                    }
                    break;

                case 6:
                    if (blog.posts.isEmpty()) {
                        System.out.println("Nenhum post foi realizado!\n");
                        break;
                    } else {
                        System.out.println("Digite o indice do post: ");
                        int index = sc.nextInt();
                        sc.nextLine();
                        try {
                            blog.posts.get(index).dislike();
                            System.out.println("Postagem não curtida\n");

                        } catch (IndexOutOfBoundsException e) {
                            System.out.println("Indice fora dos limites do ArrayList");
                        }
                    }
                case 10:
                    System.out.println("Desligando sistema...");
                    break;
                default:
                    System.out.println("Opção inválida!\n");
                    continue;
            }
        }
    }
}