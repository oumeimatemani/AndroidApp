package com.example.mobile.DAO;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Transaction;

import java.util.List;

@Dao
public interface PlanFoodDao {
   // @Insert(onConflict = OnConflictStrategy.REPLACE)
   // long insertFood(FoodEntity food);

   // @Insert(onConflict = OnConflictStrategy.REPLACE)
  //  long insertPlan(PlanFoodEntity plan);

  //  @Insert(onConflict = OnConflictStrategy.REPLACE)
   // void insertPlanFoodCrossRef(PlanFoodCrossRef crossRef);

   // @Transaction
   // @Query("SELECT * FROM foods WHERE foodId = :foodId")
   // List<FoodWithPlans> getPlansForFood(long foodId);

}

