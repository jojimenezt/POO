/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
public class Mutualfund extends ShareAsset{
    private double totalShares;
    @Override
    public double getMarketValue() {
        return totalShares*super.currentPrice;
    }

    @Override
    public double getProfit() {
        return (totalShares*super.currentPrice)-super.totalCost;
    }
    
}
