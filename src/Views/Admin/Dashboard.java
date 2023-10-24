package Views.Admin;

import java.awt.BorderLayout;
import java.awt.Color;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

public class Dashboard extends javax.swing.JPanel {

    public Dashboard() {
        initComponents();
        showBarChart();
    }

    public void showBarChart() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.setValue(200, "Amount", "January");
        dataset.setValue(150, "Amount", "February");
        dataset.setValue(180, "Amount", "March");
        dataset.setValue(100, "Amount", "April");
        dataset.setValue(80, "Amount", "May");
        dataset.setValue(250, "Amount", "June");

        JFreeChart chart = ChartFactory.createBarChart("Contribution", "Monthly", "Amount",
                dataset, PlotOrientation.VERTICAL, false, true, false);

        CategoryPlot categoryPlot = chart.getCategoryPlot();

        categoryPlot.setBackgroundPaint(Color.WHITE);
        BarRenderer renderer = (BarRenderer) categoryPlot.getRenderer();
        Color clr3 = new Color(204, 0, 51);
        renderer.setSeriesPaint(0, clr3);

        ChartPanel barChartPanel = new ChartPanel(chart);

        // Cambiar el tamaño del ChartPanel
        barChartPanel.setPreferredSize(new java.awt.Dimension(400, 250)); // Cambiar el tamaño a tus preferencias

        pnlPieChart.removeAll();
        pnlPieChart.add(barChartPanel, BorderLayout.CENTER);
        pnlPieChart.revalidate();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        pnlPieChart = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(2, 111, 136));
        lblTitulo.setText("Dashboard");
        add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 230, 46));

        pnlPieChart.setBackground(new java.awt.Color(255, 255, 255));
        add(pnlPieChart, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 730, 560));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel pnlPieChart;
    // End of variables declaration//GEN-END:variables
}
