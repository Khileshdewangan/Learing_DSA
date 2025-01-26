public class K_33_InterfaceAbstract {
    public static void main(String arg[]) {
        Queen q= new Queen();
        q.moves();
    }

}


interface chessplayer {
    void moves();
}

class Queen implements chessplayer {
    public void moves() {
        System.out.println("left, right, up, down, diagonal .........multiple step");
    }
}

class king implements chessplayer {
    public void moves() {
        System.out.println("left, right, up, down........ 1step");
    }
}

class rook implements chessplayer {
    public void moves() {
        System.out.println("up, down");
    }
}

class elephent implements chessplayer {
    public void moves() {
        System.out.println("left, right state");
    }
}
