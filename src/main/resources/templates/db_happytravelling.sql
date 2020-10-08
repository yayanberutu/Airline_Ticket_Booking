-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema db_happytravelling
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema db_happytravelling
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `db_happytravelling` ;
USE `db_happytravelling` ;

-- -----------------------------------------------------
-- Table `db_happytravelling`.`t_login`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_happytravelling`.`t_login` (
  `username` VARCHAR(50) NULL DEFAULT NULL,
  `id_role` INT NULL DEFAULT NULL,
  `lastlogin` DATETIME NULL DEFAULT NULL,
  `isactive` TINYINT(1) NULL DEFAULT NULL)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `db_happytravelling`.`t_pemesanan`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_happytravelling`.`t_pemesanan` (
  `id_pemesanan` INT NOT NULL,
  `id_user` INT NULL DEFAULT NULL,
  `id_penerbangan` INT NULL DEFAULT NULL,
  `email_pemesan` VARCHAR(45) NULL DEFAULT NULL,
  `nomor_telepon` VARCHAR(45) NULL DEFAULT NULL,
  `created_at` DATETIME NULL DEFAULT NULL,
  `updated_at` DATETIME NULL DEFAULT NULL,
  `status` INT NULL DEFAULT NULL,
  PRIMARY KEY (`id_pemesanan`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `db_happytravelling`.`t_penerbangan`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_happytravelling`.`t_penerbangan` (
  `id_penerbangan` INT NOT NULL AUTO_INCREMENT,
  `id_pesawat` INT NULL DEFAULT NULL,
  `asal` VARCHAR(45) NULL DEFAULT NULL,
  `tujuan` VARCHAR(45) NULL DEFAULT NULL,
  `tersedia_ekonomi` INT NULL DEFAULT NULL,
  `tersedia_bisnis` INT NULL DEFAULT NULL,
  `created_by` VARCHAR(45) NULL DEFAULT NULL,
  `updated_by` VARCHAR(45) NULL DEFAULT NULL,
  `created_at` DATETIME NULL DEFAULT NULL,
  `updated_at` DATETIME NULL DEFAULT NULL,
  `status` INT NULL DEFAULT NULL,
  PRIMARY KEY (`id_penerbangan`))
ENGINE = InnoDB
AUTO_INCREMENT = 2;


-- -----------------------------------------------------
-- Table `db_happytravelling`.`t_pesawat`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_happytravelling`.`t_pesawat` (
  `id_pesawat` INT NOT NULL AUTO_INCREMENT,
  `nama_pesawat` VARCHAR(45) NULL DEFAULT NULL,
  `jenis_pesawat` VARCHAR(45) NULL DEFAULT NULL,
  `kapasitas_ekonomi` INT NULL DEFAULT NULL,
  `kapasitas_bisnis` INT NULL DEFAULT NULL,
  `created_by` INT NULL DEFAULT NULL,
  `updated_by` INT NULL DEFAULT NULL,
  `created_at` DATETIME NULL DEFAULT NULL,
  `updated_at` DATETIME NULL DEFAULT NULL,
  PRIMARY KEY (`id_pesawat`))
ENGINE = InnoDB
AUTO_INCREMENT = 3;


-- -----------------------------------------------------
-- Table `db_happytravelling`.`t_role`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_happytravelling`.`t_role` (
  `id_role` INT NOT NULL AUTO_INCREMENT,
  `desc_role` VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (`id_role`))
ENGINE = InnoDB
AUTO_INCREMENT = 4;


-- -----------------------------------------------------
-- Table `db_happytravelling`.`t_tiket`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_happytravelling`.`t_tiket` (
  `id_tiket` INT NOT NULL AUTO_INCREMENT,
  `id_pemesanan` INT NULL DEFAULT NULL,
  `created_at` DATETIME NULL DEFAULT NULL,
  `updated_at` DATETIME NULL DEFAULT NULL,
  `status` INT NULL DEFAULT NULL,
  PRIMARY KEY (`id_tiket`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `db_happytravelling`.`t_user`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `db_happytravelling`.`t_user` (
  `username` VARCHAR(10) NOT NULL,
  `pwd` VARCHAR(50) NOT NULL,
  `id_role` INT NULL DEFAULT NULL,
  `fullname` VARCHAR(50) NULL DEFAULT NULL,
  PRIMARY KEY (`username`))
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
