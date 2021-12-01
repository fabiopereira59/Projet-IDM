/**
 * generated by Xtext 2.23.0
 */
package fr.n7.game;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Type Lieu</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.n7.game.GamePackage#getTypeLieu()
 * @model
 * @generated
 */
public enum TypeLieu implements Enumerator
{
  /**
   * The '<em><b>Lieu Debut</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #LIEU_DEBUT_VALUE
   * @generated
   * @ordered
   */
  LIEU_DEBUT(0, "LieuDebut", "debut"),

  /**
   * The '<em><b>Lieu Fin</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #LIEU_FIN_VALUE
   * @generated
   * @ordered
   */
  LIEU_FIN(1, "LieuFin", "fin"),

  /**
   * The '<em><b>Lieu Intermediaire</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #LIEU_INTERMEDIAIRE_VALUE
   * @generated
   * @ordered
   */
  LIEU_INTERMEDIAIRE(2, "LieuIntermediaire", "intermediaire");

  /**
   * The '<em><b>Lieu Debut</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #LIEU_DEBUT
   * @model name="LieuDebut" literal="debut"
   * @generated
   * @ordered
   */
  public static final int LIEU_DEBUT_VALUE = 0;

  /**
   * The '<em><b>Lieu Fin</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #LIEU_FIN
   * @model name="LieuFin" literal="fin"
   * @generated
   * @ordered
   */
  public static final int LIEU_FIN_VALUE = 1;

  /**
   * The '<em><b>Lieu Intermediaire</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #LIEU_INTERMEDIAIRE
   * @model name="LieuIntermediaire" literal="intermediaire"
   * @generated
   * @ordered
   */
  public static final int LIEU_INTERMEDIAIRE_VALUE = 2;

  /**
   * An array of all the '<em><b>Type Lieu</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final TypeLieu[] VALUES_ARRAY =
    new TypeLieu[]
    {
      LIEU_DEBUT,
      LIEU_FIN,
      LIEU_INTERMEDIAIRE,
    };

  /**
   * A public read-only list of all the '<em><b>Type Lieu</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<TypeLieu> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Type Lieu</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static TypeLieu get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      TypeLieu result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Type Lieu</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static TypeLieu getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      TypeLieu result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Type Lieu</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static TypeLieu get(int value)
  {
    switch (value)
    {
      case LIEU_DEBUT_VALUE: return LIEU_DEBUT;
      case LIEU_FIN_VALUE: return LIEU_FIN;
      case LIEU_INTERMEDIAIRE_VALUE: return LIEU_INTERMEDIAIRE;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private TypeLieu(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //TypeLieu