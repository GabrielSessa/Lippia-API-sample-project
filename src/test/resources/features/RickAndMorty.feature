Feature: Rick and Morty

  @RyM @ok
  Scenario Outline: Pedimos un personaje al API de Rick and Morty
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and '<inputParameters>'
    Then se obtuvo el status code <statusCode>
    Then se obtuvo el response esperado en <entity> con el <jsonNameResponse>
    Examples:
      | jsonName         | statusCode | inputParameters | operation | entity    | jsonNameResponse     |
      | RyM/rq_character | 200        | character:2     | GET       | CHARACTER | RyM/rp_character_200 |

  @RyM @ok
  Scenario Outline: Pedimos un personaje al API de Rick and Morty
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and '<inputParameters>'
    Then se obtuvo el status code <statusCode>
    Then la respuesta es  correcta
    Examples:
      | jsonName         | statusCode | inputParameters | operation | entity    | jsonNameResponse     |
      | RyM/rq_character | 200        | character:2     | GET       | CHARACTER | RyM/rp_character_200 |

  @RyM @error
  Scenario Outline: Pedimos un personaje al API de Rick and Morty
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and '<inputParameters>'
    Then se obtuvo el status code <statusCode>
    Then se obtuvo el response esperado en <entity> con el <jsonNameResponse>
    Examples:
      | jsonName         | statusCode | inputParameters | operation | entity | jsonNameResponse     |
      | RyM/rq_character | 404        | character:9999  | GET       | ERROR  | RyM/rp_character_404 |

  @RyM @ok @okV2
  Scenario Outline: Pedimos todos los personajes al API de Rick and Morty
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    And obtengo el primer personaje de la lista
    Then se obtuvo el status code <statusCode>
    Then se obtuvo el response esperado en <entity> con el <jsonNameResponse>
    Examples:
      | jsonName             | statusCode | operation | entity        | jsonNameResponse         |
      | RyM/rq_all_character | 200        | GET       | ALL_CHARACTER | RyM/rp_all_character_200 |

  @RyM @ok @okV2
  Scenario Outline: Pedimos un personaje al API de Rick and Morty
    Given Un ID Character
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    Then se obtuvo el status code <statusCode>
    Then la respuesta es correcta para el primer personaje
    Examples:
      | jsonName         | statusCode | operation     | entity    |
      | RyM/rq_character | 200        | GETWITHPARAMS | CHARACTER |

  @RyM @aleatorio
  Scenario Outline: Pedimos todos los episodios al API de Rick and Morty
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    And obtengo la cuenta total de episodios
    And obtengo un episodio aleatorio de la lista
    Then se obtuvo el status code <statusCode>
    Examples:
      | jsonName            | statusCode | operation | entity       |
      | RyM/rq_all_episodes | 200        | GET       | ALL_EPISODES |

  @RyM @aleatorio
  Scenario Outline: Pedimos un episodio aleatorio al API de Rick and Morty
    Given Un ID Episode
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    Then se obtuvo el status code <statusCode>
    Then la respuesta es correcta para el episodio aleatorio
    Examples:
      | jsonName       | statusCode | operation     | entity  |
      | RyM/rq_episode | 200        | GETWITHPARAMS | EPISODE |
