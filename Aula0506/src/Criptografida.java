
public class Criptografida {
	char ascii;
    char x, y;
    String mensagem;
    int chave;
    
 
    public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public int getChave() {
		return chave;
	}

	public void setChave(int chave) {
		this.chave = chave;
	}
	{
	while (chave >= 26){
        chave = chave - 26;
    }
    for (int i = 0; i < this.getMensagem().length(); i++) {
          
        if ( this.getMensagem().charAt(i) >= 97 &&  this.getMensagem().charAt(i) <= 122) {
            if ((int) ( this.getMensagem().charAt(i) + chave) > 122) {
                x = (char) ( this.getMensagem().charAt(i) + chave);
                y = (char) (x - 122);
                ascii = (char) (96 + y);
                System.out.print(ascii + "");
            } else {
                ascii = (char) ( this.getMensagem().charAt(i) + chave);
                System.out.print(ascii + "");

            }
        }
          
        if ( this.getMensagem().charAt(i) >= 65 && this.getMensagem().charAt(i) <= 90) {
            if ( this.getMensagem().charAt(i) + chave > 90) {
                x = (char) ( this.getMensagem().charAt(i) + chave);
                y = (char) (x - 90);
                ascii = (char) (64 + y);
                System.out.print(ascii + "");
            } else {
                ascii = (char) ( this.getMensagem().charAt(i) + chave);
                System.out.print(ascii + "");
            }
        }
    }

}
}
    

