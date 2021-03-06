package laberinto;

import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 * Interfaz grafica
 */
public class GUI extends javax.swing.JFrame {

    // Matriz
    int[][] laberinto = new int[][]{
        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
        {0, 2, 2, 1, 1, 0, 0, 0, 0, 1, 0, 0, 1, 0},
        {0, 0, 2, 0, 0, 0, 1, 1, 0, 2, 2, 2, 2, 0},
        {0, 0, 2, 1, 1, 0, 0, 1, 0, 2, 0, 0, 2, 0},
        {0, 1, 2, 0, 1, 1, 0, 1, 0, 2, 0, 0, 2, 0},
        {0, 0, 2, 0, 1, 0, 0, 1, 0, 2, 1, 0, 2, 0},
        {0, 1, 2, 0, 1, 1, 1, 1, 0, 2, 0, 0, 2, 0},
        {0, 0, 2, 0, 0, 0, 0, 0, 0, 2, 1, 0, 2, 0},
        {0, 0, 2, 2, 2, 2, 2, 2, 2, 2, 0, 0, 2, 0},
        {0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 2, 0},
        {0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 2, 2, 0},
        {0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 1, 2, 0, 0},
        {0, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 2, 3, 4},
        {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
    };
    // Coordenadas de los paneles
    int aM;
    int aN;
    int bM;
    int bN;
    int cM;
    int cN;
    int dM;
    int dN;
    int eM;
    int eN;
    int fM;
    int fN;
    int gM;
    int gN;
    int hM;
    int hN;
    int playerM;
    int playerN;

    // Permite ver la solucion del laberinto
    int solucion;

    /**
     * Constructor
     */
    public GUI() {
        initComponents();

        // Configuracion inicial de los paneles: Coordenadas y color
        aM = 0;
        aN = 0;
        mapaA.setBackground(Color.gray);

        bM = 0;
        bN = 1;
        mapaB.setBackground(Color.gray);

        cM = 0;
        cN = 2;
        mapaC.setBackground(Color.gray);

        dM = 1;
        dN = 0;
        mapaD.setBackground(Color.gray);

        eM = 1;
        eN = 2;
        mapaE.setBackground(Color.cyan);

        fM = 2;
        fN = 0;
        mapaG.setBackground(Color.gray);

        gM = 2;
        gN = 1;
        mapaF.setBackground(Color.gray);

        hM = 2;
        hN = 2;
        mapaH.setBackground(Color.cyan);

        playerM = 1;
        playerN = 1;
        mapaJugador.setBackground(Color.magenta);

        // Por defecto la solucion no se muestra
        solucion = 0;
        botonSolucion.setText("Mostrar ayuda");
    }

    /**
     * Inicializa los componentes del JFrame
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mapaA = new javax.swing.JPanel();
        mapaB = new javax.swing.JPanel();
        mapaC = new javax.swing.JPanel();
        mapaD = new javax.swing.JPanel();
        mapaE = new javax.swing.JPanel();
        mapaF = new javax.swing.JPanel();
        mapaG = new javax.swing.JPanel();
        mapaH = new javax.swing.JPanel();
        mapaJugador = new javax.swing.JPanel();
        botonArriba = new javax.swing.JButton();
        botonAbajo = new javax.swing.JButton();
        botonIzquierda = new javax.swing.JButton();
        botonDerecha = new javax.swing.JButton();
        botonSolucion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mapaA.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        mapaA.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout mapaALayout = new javax.swing.GroupLayout(mapaA);
        mapaA.setLayout(mapaALayout);
        mapaALayout.setHorizontalGroup(
            mapaALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 198, Short.MAX_VALUE)
        );
        mapaALayout.setVerticalGroup(
            mapaALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 198, Short.MAX_VALUE)
        );

        mapaB.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout mapaBLayout = new javax.swing.GroupLayout(mapaB);
        mapaB.setLayout(mapaBLayout);
        mapaBLayout.setHorizontalGroup(
            mapaBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 198, Short.MAX_VALUE)
        );
        mapaBLayout.setVerticalGroup(
            mapaBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 198, Short.MAX_VALUE)
        );

        mapaC.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout mapaCLayout = new javax.swing.GroupLayout(mapaC);
        mapaC.setLayout(mapaCLayout);
        mapaCLayout.setHorizontalGroup(
            mapaCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 198, Short.MAX_VALUE)
        );
        mapaCLayout.setVerticalGroup(
            mapaCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 198, Short.MAX_VALUE)
        );

        mapaD.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout mapaDLayout = new javax.swing.GroupLayout(mapaD);
        mapaD.setLayout(mapaDLayout);
        mapaDLayout.setHorizontalGroup(
            mapaDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 198, Short.MAX_VALUE)
        );
        mapaDLayout.setVerticalGroup(
            mapaDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 198, Short.MAX_VALUE)
        );

        mapaE.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout mapaELayout = new javax.swing.GroupLayout(mapaE);
        mapaE.setLayout(mapaELayout);
        mapaELayout.setHorizontalGroup(
            mapaELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 198, Short.MAX_VALUE)
        );
        mapaELayout.setVerticalGroup(
            mapaELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 198, Short.MAX_VALUE)
        );

        mapaF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout mapaFLayout = new javax.swing.GroupLayout(mapaF);
        mapaF.setLayout(mapaFLayout);
        mapaFLayout.setHorizontalGroup(
            mapaFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 198, Short.MAX_VALUE)
        );
        mapaFLayout.setVerticalGroup(
            mapaFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 198, Short.MAX_VALUE)
        );

        mapaG.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout mapaGLayout = new javax.swing.GroupLayout(mapaG);
        mapaG.setLayout(mapaGLayout);
        mapaGLayout.setHorizontalGroup(
            mapaGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 198, Short.MAX_VALUE)
        );
        mapaGLayout.setVerticalGroup(
            mapaGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 198, Short.MAX_VALUE)
        );

        mapaH.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout mapaHLayout = new javax.swing.GroupLayout(mapaH);
        mapaH.setLayout(mapaHLayout);
        mapaHLayout.setHorizontalGroup(
            mapaHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 198, Short.MAX_VALUE)
        );
        mapaHLayout.setVerticalGroup(
            mapaHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 198, Short.MAX_VALUE)
        );

        mapaJugador.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout mapaJugadorLayout = new javax.swing.GroupLayout(mapaJugador);
        mapaJugador.setLayout(mapaJugadorLayout);
        mapaJugadorLayout.setHorizontalGroup(
            mapaJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 198, Short.MAX_VALUE)
        );
        mapaJugadorLayout.setVerticalGroup(
            mapaJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 198, Short.MAX_VALUE)
        );

        botonArriba.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        botonArriba.setText("Arriba");
        botonArriba.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonArribaMouseClicked(evt);
            }
        });

        botonAbajo.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        botonAbajo.setText("Abajo");
        botonAbajo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonAbajoMouseClicked(evt);
            }
        });

        botonIzquierda.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        botonIzquierda.setText("Izquierda");
        botonIzquierda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonIzquierdaMouseClicked(evt);
            }
        });

        botonDerecha.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        botonDerecha.setText("Derecha");
        botonDerecha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonDerechaMouseClicked(evt);
            }
        });

        botonSolucion.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botonSolucion.setText("Mostrar ayuda");
        botonSolucion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonSolucionMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(mapaA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonArriba, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(mapaB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(mapaC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botonIzquierda, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(215, 215, 215)
                                .addComponent(botonAbajo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(mapaD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(mapaJugador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(mapaE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(mapaF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(mapaG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(mapaH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(botonDerecha, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(botonSolucion, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(359, 359, 359)
                        .addComponent(botonIzquierda, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(218, 218, 218))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(botonArriba, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(mapaB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mapaA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mapaC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(botonDerecha, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(281, 281, 281))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(mapaD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(mapaE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(mapaJugador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, 0)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(mapaG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(mapaH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(mapaF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botonAbajo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonSolucion, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Registra un movimiento hacia arriba
     *
     * @param evt Click
     */
    private void botonArribaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonArribaMouseClicked
        // Primero comprueba que el movimientose haga hacia una posicion permitida ("Camino")
        if (laberinto[bM][bN] == 0) {
            JOptionPane.showMessageDialog(this, "Movimiento no permitido");
        } else {
            // Luego realiza el movimiento
            // Para ir hacia arriba se resta 1 en el valor de filas de la coordenada en la matriz laberinto
            aM = aM - 1;
            bM = bM - 1;
            cM = cM - 1;
            dM = dM - 1;
            eM = eM - 1;
            fM = fM - 1;
            gM = gM - 1;
            hM = hM - 1;
            playerM = playerM - 1;

            // Al final, se envia las nuevas coordenadas para que se registre el movimiento
            // El movimiento se registra al cambiar de color los paneles
            pintarMapa(mapaA, aM, aN);
            pintarMapa(mapaB, bM, bN);
            pintarMapa(mapaC, cM, cN);
            pintarMapa(mapaD, dM, dN);
            pintarMapa(mapaE, eM, eN);
            pintarMapa(mapaF, fM, fN);
            pintarMapa(mapaG, gM, gN);
            pintarMapa(mapaH, hM, hN);
        }
    }//GEN-LAST:event_botonArribaMouseClicked

    /**
     * Registra movimiento hacia la derecha
     *
     * @param evt Click
     */
    private void botonDerechaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonDerechaMouseClicked
        // Primero comprueba que el movimientose haga hacia una posicion permitida ("Camino")
        if (laberinto[eM][eN] == 0) {
            JOptionPane.showMessageDialog(this, "Movimiento no permitido");
        } else {
            // Luego realiza el movimiento
            // Para ir hacia la derecha se suma 1 en el valor de columnas de la coordenada en la matriz laberinto
            aN = aN + 1;
            bN = bN + 1;
            cN = cN + 1;
            dN = dN + 1;
            eN = eN + 1;
            fN = fN + 1;
            gN = gN + 1;
            hN = hN + 1;
            playerN = playerN + 1;

            // Al final, se envia las nuevas coordenadas para que se registre el movimiento
            // El movimiento se registra al cambiar de color los paneles
            pintarMapa(mapaB, bM, bN);
            pintarMapa(mapaC, cM, cN);
            pintarMapa(mapaD, dM, dN);
            pintarMapa(mapaE, eM, eN);
            pintarMapa(mapaF, fM, fN);
            pintarMapa(mapaG, gM, gN);
            pintarMapa(mapaH, hM, hN);

            if (laberinto[playerM][playerN] == 3) {
                // Unico del movimiento hacia la derecha
                // Si el jugador se mueve hacia la posicion donde laberinto es igual a 3, se termina el juego en victoria
                botonArriba.setVisible(false);
                botonAbajo.setVisible(false);
                botonIzquierda.setVisible(false);
                botonDerecha.setVisible(false);
                JOptionPane.showMessageDialog(this, "Felicitaciones. Ha completado el laberinto");
            }
        }
    }//GEN-LAST:event_botonDerechaMouseClicked

    /**
     * Registra movimiento hacia la izquierda
     *
     * @param evt Click
     */
    private void botonIzquierdaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonIzquierdaMouseClicked
        // Primero comprueba que el movimientose haga hacia una posicion permitida ("Camino")
        if (laberinto[dM][dN] == 0) {
            JOptionPane.showMessageDialog(this, "Movimiento no permitido");
        } else {
            // Luego realiza el movimiento
            // Para ir hacia la izquierda se resta 1 en el valor de columnas de la coordenada en la matriz laberinto
            aN = aN - 1;
            bN = bN - 1;
            cN = cN - 1;
            dN = dN - 1;
            eN = eN - 1;
            fN = fN - 1;
            gN = gN - 1;
            hN = hN - 1;
            playerN = playerN - 1;

            // Al final, se envia las nuevas coordenadas para que se registre el movimiento
            // El movimiento se registra al cambiar de color los paneles
            pintarMapa(mapaA, aM, aN);
            pintarMapa(mapaB, bM, bN);
            pintarMapa(mapaC, cM, cN);
            pintarMapa(mapaD, dM, dN);
            pintarMapa(mapaE, eM, eN);
            pintarMapa(mapaF, fM, fN);
            pintarMapa(mapaG, gM, gN);
            pintarMapa(mapaH, hM, hN);
        }
    }//GEN-LAST:event_botonIzquierdaMouseClicked

    /**
     * Registra movimiento hacia abajo
     *
     * @param evt Click
     */
    private void botonAbajoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAbajoMouseClicked
        // Primero comprueba que el movimientose haga hacia una posicion permitida ("Camino")
        if (laberinto[gM][gN] == 0) {
            JOptionPane.showMessageDialog(this, "Movimiento no permitido");
        } else {
            // Luego realiza el movimiento
            // Para ir hacia abajo se suma 1 en el valor de filas de la coordenada en la matriz laberinto
            aM = aM + 1;
            bM = bM + 1;
            cM = cM + 1;
            dM = dM + 1;
            eM = eM + 1;
            fM = fM + 1;
            gM = gM + 1;
            hM = hM + 1;
            playerM = playerM + 1;

            // Al final, se envia las nuevas coordenadas para que se registre el movimiento
            // El movimiento se registra al cambiar de color los paneles
            pintarMapa(mapaA, aM, aN);
            pintarMapa(mapaB, bM, bN);
            pintarMapa(mapaC, cM, cN);
            pintarMapa(mapaD, dM, dN);
            pintarMapa(mapaE, eM, eN);
            pintarMapa(mapaF, fM, fN);
            pintarMapa(mapaG, gM, gN);
            pintarMapa(mapaH, hM, hN);
        }
    }//GEN-LAST:event_botonAbajoMouseClicked

    /**
     * Activa o desactiva la funcion de mostrar la solucion
     *
     * @param evt Click
     */
    private void botonSolucionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonSolucionMouseClicked
        if (solucion == 0) {
            // Si la solucion esta desactivada, se activa
            solucion = 1;
            botonSolucion.setText("Ocultar ayuda");
            pintarMapa(mapaA, aM, aN);
            pintarMapa(mapaB, bM, bN);
            pintarMapa(mapaC, cM, cN);
            pintarMapa(mapaD, dM, dN);
            pintarMapa(mapaE, eM, eN);
            pintarMapa(mapaF, fM, fN);
            pintarMapa(mapaG, gM, gN);
            pintarMapa(mapaH, hM, hN);
            JOptionPane.showMessageDialog(this, "Ayuda: Si no ve el camino verde, retroceda algunas posiciones hasta que lo encuentre");
        } else if (solucion == 1) {
            // Si la solucion esta activada, se desactiva
            solucion = 0;
            botonSolucion.setText("Mostrar ayuda");
            pintarMapa(mapaA, aM, aN);
            pintarMapa(mapaB, bM, bN);
            pintarMapa(mapaC, cM, cN);
            pintarMapa(mapaD, dM, dN);
            pintarMapa(mapaE, eM, eN);
            pintarMapa(mapaF, fM, fN);
            pintarMapa(mapaG, gM, gN);
            pintarMapa(mapaH, hM, hN);
        }
    }//GEN-LAST:event_botonSolucionMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    /**
     * Pinta el panel dependiendo del valor de la posicion en la matriz
     *
     * @param mapa El panel
     * @param m Fila en la matriz laberinto
     * @param n Columna en la matriz laberinto
     */
    public void pintarMapa(JPanel mapa, int m, int n) {
        int terreno = laberinto[m][n];
        switch (terreno) {
            case 0:
                mapa.setBackground(Color.gray);
                break;
            case 1:
                mapa.setBackground(Color.cyan);
                break;
            case 2:
                if (solucion == 0) {
                    mapa.setBackground(Color.cyan);
                } else if (solucion == 1) {
                    mapa.setBackground(Color.green);
                }
                break;
            case 3:
                mapa.setBackground(Color.cyan);
                break;
            case 4:
                mapa.setBackground(Color.red);
            default:
                break;
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAbajo;
    private javax.swing.JButton botonArriba;
    private javax.swing.JButton botonDerecha;
    private javax.swing.JButton botonIzquierda;
    private javax.swing.JButton botonSolucion;
    private javax.swing.JPanel mapaA;
    private javax.swing.JPanel mapaB;
    private javax.swing.JPanel mapaC;
    private javax.swing.JPanel mapaD;
    private javax.swing.JPanel mapaE;
    private javax.swing.JPanel mapaF;
    private javax.swing.JPanel mapaG;
    private javax.swing.JPanel mapaH;
    private javax.swing.JPanel mapaJugador;
    // End of variables declaration//GEN-END:variables
}
