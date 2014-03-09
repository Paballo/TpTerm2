/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.property.model.userPackage.Impl;

/**
 *
 * @author donkey
 */
public final class Renting {
    private double deposit;

    private Renting(Builder b) {
        this.deposit = b.deposit;
    }
    
    public static class Builder
    {
      private double deposit;
      
      public Builder(double deposit)
      {
          this.deposit = deposit;
      }
      
      public Builder renting(double deposit)
      {
          this.deposit = deposit;
          return this;
      }
      
      public Renting renting()
      {
          return new Renting(this);
      }

        public double getDeposit() {
            return deposit;
        }

        @Override
        public int hashCode() {
            int hash = 7;
            hash = 83 * hash + (int) (Double.doubleToLongBits(this.deposit) ^ (Double.doubleToLongBits(this.deposit) >>> 32));
            return hash;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj == null) {
                return false;
            }
            if (getClass() != obj.getClass()) {
                return false;
            }
            final Builder other = (Builder) obj;
            if (Double.doubleToLongBits(this.deposit) != Double.doubleToLongBits(other.deposit)) {
                return false;
            }
            return true;
        }
      
        
    }
}
