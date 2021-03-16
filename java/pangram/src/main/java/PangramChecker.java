public class PangramChecker {

    public boolean isPangram(String input) {
        int index = 0;
        boolean[] visited = new boolean[26];

        for (int id = 0; id < input.length(); id++){
            if (input.charAt(id) >= 'a' && input.charAt(id) <= 'z'){
                index = input.charAt(id) - 'a';
            }else if (input.charAt(id) >= 'A' && input.charAt(id) <= 'Z'){
                index = input.charAt(id) - 'A';
            }
            visited[index] = true;
        }
        for (int id = 0; id < 26; id++){
            if (!visited[id]){
                return false;
            }
        }
        return true;
    }

}
