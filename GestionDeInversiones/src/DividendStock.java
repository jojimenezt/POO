/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
public class DividendStock extends Stock{
    private double dividends;
    
    @Override
    public double getMarketValue() {
        return (totalShares*super.currentPrice)+dividends;
    }

    @Override
    public double getProfit() {
        return (totalShares*super.currentPrice)-super.totalCost;
    }
    
}
