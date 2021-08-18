import java.util.ArrayList;

class Playlist {
  
  public static void main(String[] args) {
    ArrayList<String> desertIslandPlaylist = new ArrayList<String>();
    desertIslandPlaylist.add("Enter Sandman");
    desertIslandPlaylist.add("Sad but true");
    desertIslandPlaylist.add("Holier than thou");
    desertIslandPlaylist.add("The unforgiven");
    desertIslandPlaylist.add("Wherever I may roam");
    System.out.println(desertIslandPlaylist);
    System.out.println(desertIslandPlaylist.size());

    int indexA = desertIslandPlaylist.indexOf("Enter Sandman");
int indexB = desertIslandPlaylist.indexOf("Sad but true");
    String tempA = "Enter Sandman";
    desertIslandPlaylist.set(indexA, "Sad but true");
    desertIslandPlaylist.set(indexB, tempA);
    System.out.println(desertIslandPlaylist);
  }
  
}









