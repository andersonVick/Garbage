/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;


import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

public class ALLTHETHINGS extends SubsystemBase {
  /**
   * Creates a new ALLTHETHINGS.
   */
  public ALLTHETHINGS() {
    
  }
  // NEOS
  CANSparkMax Neo1 = new CANSparkMax(Constants.neo1, MotorType.kBrushless);
  CANSparkMax Neo2 = new CANSparkMax(Constants.neo2, MotorType.kBrushless);
  CANSparkMax Neo3 = new CANSparkMax(Constants.neo3, MotorType.kBrushless);
  CANSparkMax Neo4 = new CANSparkMax(Constants.neo4, MotorType.kBrushless);
  CANSparkMax Neo5 = new CANSparkMax(Constants.neo5, MotorType.kBrushless);
  CANSparkMax Neo6 = new CANSparkMax(Constants.neo6, MotorType.kBrushless);
  // 775
  WPI_TalonSRX the775 = new WPI_TalonSRX(Constants.the775);
  // 550
  CANSparkMax the550 = new CANSparkMax(Constants.the550, MotorType.kBrushless);

  // THE MORTAL CMDs
  public void MORTALCMDSTART(){
    Neo1.set(Constants.MORTALSPD);
    Neo2.set(Constants.MORTALSPD);
    Neo3.set(Constants.MORTALSPD);
    Neo4.set(Constants.MORTALSPD);
    Neo5.set(Constants.MORTALSPD);
    Neo6.set(Constants.MORTALSPD);
    the775.set(Constants.MORTALSPD);
    the550.set(Constants.MORTALSPD);
  }

  public void MORTALCMDSTOP(){
    Neo1.set(0);
    Neo2.set(0);
    Neo3.set(0);
    Neo4.set(0);
    Neo5.set(0);
    Neo6.set(0);
    the775.set(0);
    the550.set(0);
  }
  

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
